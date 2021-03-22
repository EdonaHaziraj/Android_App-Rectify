package rectify.app.platformaegabimeve;


        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.Toast;

        import com.example.platformaegabimeve.R;
        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

        import java.util.ArrayList;
        import java.util.List;

        public class OptionsActivity extends AppCompatActivity {


        FirebaseDatabase database;
        DatabaseReference reff;
        Member member;
        Button button;
        Spinner kategoria;
        int maxid=0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);


        button = findViewById(R.id.button_vazhdo);
        kategoria = findViewById(R.id.spinner1);
        member = new Member();

                /*mStorageRef = FirebaseStorage.getInstance().getReference("Spinner");

                mDatabaseRef = FirebaseDatabase.getInstance().getReference("Spinner");*/
        reff = database.getInstance().getReference().child("kategoria ");

        List<String> categories = new ArrayList<>();
        categories.add(0, "Përzgjedh kategorinë");
        categories.add("Informatë e pasaktë");
        categories.add("Gabim drejtshkrimor");
        categories.add("Përmbajtje fyese");
        categories.add("Shfaqje e dhunës");
        categories.add("Përkthim i gabuar");
        categories.add("Tjetër");
        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                kategoria.setAdapter(dataAdapter);

                kategoria.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (adapterView.getItemAtPosition(i).equals("Përzgjedh kategorinë")) {

                return;
        } else {
        String item = adapterView.getItemAtPosition(i).toString();

        }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {




        }
        });
        reff.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        if (dataSnapshot.exists())
        maxid = (int) dataSnapshot.getChildrenCount();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
        });

        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


        String selectedCategory = kategoria.getSelectedItem().toString();
        if (kategoria != null && !kategoria.getSelectedItem().toString().equals("Përzgjedh kategorinë")){


        member.setSpinner(selectedCategory);
        /*Toast.makeText(OptionsActivity.this, "Registration Successfull", Toast.LENGTH_LONG).show();*/
        //toast.show();

        //reff.child(String.valueOf(maxid+1)).setValue(member);


                Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
                intent.putExtra("SPINNER_VALUE", selectedCategory);
                startActivity(intent);

        }
        else {
                Toast.makeText(OptionsActivity.this, "Ju lutem zgjedhni një kategori", Toast.LENGTH_LONG).show();
        }
        }



        });






        }
        }

