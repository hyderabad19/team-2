//package com.example.skyscraper.photoblog;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;
//import android.text.TextUtils;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//public class FeedbackSubmit extends AppCompatActivity {
//    private EditText answer;
//    private RadioGroup rating;
//    public RadioButton ratingRadioButton;
//    private RadioGroup  helpfulness;
//    private RadioButton helpRadioButton;
//    private EditText suggestions;
//    private Button submit;
//    private Button reset;
//    private FirebaseDatabase mydatabase;
//    private FirebaseAuth mAuth;
//    private FirebaseAuth.AuthStateListener mAuthListener;
//    private FirebaseDatabase myDatabase;
//    private DatabaseReference myRef;
//    private String userid;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.resume);
////        mAuth = FirebaseAuth.getInstance();
////        myDatabase=FirebaseDatabase.getInstance();
////        myRef=mydatabase.getReference();
////        FirebaseUser user= mAuth.getCurrentUser();
////        userid=user.getUid();
////        answer = findViewById(R.id.answer);
////        rating = (RadioGroup) findViewById(R.id.rating);
////        helpfulness = (RadioGroup) findViewById(R.id.helpfulness);
////        submit=(Button)findViewById(R.id.submitbutton);
//        //reset=(Button)findViewById(R.id.resetbutton);
////        mAuthListener =new FirebaseAuth.AuthStateListener() {
////            @Override
////            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
////                FirebaseUser user=mAuth.getCurrentUser();
////                if (user != null) {
////                    // User is signed in
////                    Log.d("Add Feedback", "onAuthStateChanged:signed_in:" + user.getUid());
////                    //new Toast("Successfully signed in with: " + user.getEmail());
////                } else {
////                    // User is signed out
////                    Log.d("Add Feedback", "onAuthStateChanged:signed_out");
////                    //Toast("Successfully signed out.");
////                }
////            }
////        };
//
////        submit.setOnClickListener(new android.view.View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                String ans = answer.getText().toString();
////                String sug = suggestions.getText().toString();
////                int selectedRating = rating.getCheckedRadioButtonId();
////                int selectedhelpfulness = helpfulness.getCheckedRadioButtonId();
////                ratingRadioButton= (RadioButton)findViewById(selectedRating);
////                helpRadioButton=(RadioButton) findViewById(selectedhelpfulness);
////                if(TextUtils.isEmpty(userid))
////                {
////                    myRef=FirebaseDatabase.getInstance().getReference().child("survey");
////                    DatabaseReference subDatabaseReference = myRef.child(userid);
////                    subDatabaseReference.child("answer").setValue(ans);
////                    subDatabaseReference.child("suggestions").setValue(sug);
////                    subDatabaseReference.child("rating").setValue(ratingRadioButton.getText());
////                    subDatabaseReference.child("helpfulness").setValue(helpRadioButton.getText());
////                    // Toast.makeText(FeedbackSubmit.this, "Feedback is updated", Toast.LENGTH_LONG).show();
////
////                }
////
////            }
////        });
//    }
//    @Override
//    protected void onStart() {
//        super.onStart();
////        FirebaseUser firebaseUser = mAuth.getCurrentUser();
////        if (firebaseUser == null) {
////            Intent startAuthActivity = new Intent(FeedbackSubmit.this,LoginActivity.class);
////            startActivity(startAuthActivity);
////            finish();
////        }
//    }
//}
//
