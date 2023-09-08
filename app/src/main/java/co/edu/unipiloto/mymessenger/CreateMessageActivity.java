package co.edu.unipiloto.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import co.edu.unipiloto.mymessenger.R;

public class CreateMessageActivity extends Activity {

    EditText etEnviar;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);


//        etEnviar = findViewById(R.id.message);
//        btnEnviar = findViewById(R.id.send);
//
//        btnEnviar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Bundle enviarDatos = new Bundle();
//                enviarDatos.putString("keyDatos", etEnviar.getText().toString());
//
//                Intent intent = new Intent(CreateMessageActivity.this, ReceiveMessageActivity.class);
//                intent.putExtras(enviarDatos);
//                startActivity(intent);
//            }
//        });
//    }
//}
    }

    //Call onSendMesaage() wheb the button in clicked
    public void onSendMessage(View view) {
        EditText messageView=(EditText)findViewById(R.id.message);
        String messageText=messageView.getText().toString();
        Intent intent = new Intent(CreateMessageActivity.this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        startActivity(intent);
    }
}
