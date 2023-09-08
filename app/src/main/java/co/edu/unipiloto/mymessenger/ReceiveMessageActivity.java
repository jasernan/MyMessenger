package co.edu.unipiloto.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ReceiveMessageActivity extends Activity {

    public static final String EXTRA_MESSAGE = "message";
    private ArrayList<String> messageList = new ArrayList<>(); // Lista para mantener el historial de mensajes
    private ArrayAdapter<String> messageAdapter; // Adaptador para el ListView

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_receive_message);

            // Inicializa el adaptador y el ListView
            ListView messageListView = findViewById(R.id.messageListView); // Asegúrate de tener un ListView en tu layout
        messageAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, messageList);
        messageListView.setAdapter(messageAdapter);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);

        if (messageText != null && !messageText.isEmpty()) {
            // Si se recibió un mensaje válido, agrégalo a la lista y actualiza el adaptador
            messageList.add(messageText);
            messageAdapter.notifyDataSetChanged();
        }
    }
}
