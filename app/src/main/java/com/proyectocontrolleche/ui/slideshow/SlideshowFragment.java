package com.proyectocontrolleche.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.chip.Chip;
import com.proyectocontrolleche.ActualizarProductor;
import com.proyectocontrolleche.R;
import com.proyectocontrolleche.RegistroNuevoProductor;
import com.proyectocontrolleche.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inicializa el ViewModel
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        // Inflamos el layout utilizando el binding
        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Encuentra el Chip en el layout
        Chip BtnRegistrarProductor = root.findViewById(R.id.btnRegistrarProductor);
        Chip BtnActualizarProductor = root.findViewById(R.id.btnActualizarProductor);

        // Configura el OnClickListener para los chips
        BtnRegistrarProductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la actividad RegistroNuevoProductor
                Intent intent = new Intent(getActivity(), RegistroNuevoProductor.class);
                startActivity(intent);
            }
        });

        BtnActualizarProductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la actividad ActualizarProductor
                Intent intent = new Intent(getActivity(), ActualizarProductor.class);
                startActivity(intent);
            }
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Limpia el binding
        binding = null;
    }
}
