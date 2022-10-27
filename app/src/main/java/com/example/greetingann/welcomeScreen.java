package com.example.greetingann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Angel Negron
 */
public class welcomeScreen extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_languages, container, false);
        Button btnLang = view.findViewById(R.id.btn_translate);
        Spinner spinOptions = view.findViewById(R.id.spinner);


        //String transString = welcomeScreenArgs.fromBundle(requireArguments().getMessage());

        btnLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                //Passed the string Language chosen by the user and translates it
           welcomeScreenDirections.ActionWelcomeScreenToLanguages action
                        = welcomeScreenDirections.actionWelcomeScreenToLanguages(chosenLang(spinOptions));

           //Performs action by taking it to the proper screen
                Navigation.findNavController(view).navigate(action);


            }
        });




        return view;
    }

    public String chosenLang(Spinner spin)
    {
       String lang = spin.getSelectedItem().toString();

       if (lang.equals("Spanish"))
       {
           return "Hola";
       }
       else if (lang.equals("French"))
       {
           return "bonjour";
       }
       else
        return "Hello";
    }
}