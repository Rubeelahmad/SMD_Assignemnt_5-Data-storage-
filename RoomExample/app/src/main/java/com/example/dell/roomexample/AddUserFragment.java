package com.example.dell.roomexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {
    EditText userid,usernmae,useremail;
    Button save;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_add_user, container, false);
        userid=view.findViewById(R.id.userid);
        usernmae=view.findViewById(R.id.username);
        useremail=view.findViewById(R.id.useremail);
        save=view.findViewById(R.id.savebtn);

        save.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
               int uid=Integer.parseInt(userid.getText().toString());
               String uname=usernmae.getText().toString();
               String uemail=useremail.getText().toString();

               User user=new User();
               user.setId(uid);
               user.setName(uname);
               user.setEmail(uemail);
               MainActivity.myAppDatabase.myDao().addUser(user);
                Toast.makeText(getActivity(),"User add Successfully ",Toast.LENGTH_SHORT).show();
                userid.setText("");
                usernmae.setText("");
                useremail.setText("");
            }
        });
        return view;
    }

}
