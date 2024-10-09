package com.proyectocontrolleche.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.proyectocontrolleche.R;
import com.proyectocontrolleche.RegistrarLecheDialogFragment;
import com.proyectocontrolleche.databinding.FragmentHomeBinding;
import com.proyectocontrolleche.ui.home.HomeViewModel;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // CalendarView listener
        CalendarView calendarView = binding.calendarView;
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                try {
                    // Crear una instancia del diálogo
                    RegistrarLecheDialogFragment dialogFragment = new RegistrarLecheDialogFragment();

                    // Mostrar el diálogo
                    FragmentManager fragmentManager = getParentFragmentManager();
                    dialogFragment.show(fragmentManager, "RegistrarLecheDialog");
                } catch (Exception e) {
                    e.printStackTrace();
                    // Manejar el error de alguna manera, por ejemplo, mostrando un mensaje al usuario
                }
            }
        });

        // Vincula el BottomNavigationView desde el binding
        BottomNavigationView bottomNavigationView = binding.bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                try {
                    int id = item.getItemId();
                    if (id == R.id.nav_leche_manana) {
                        // Lógica para leche de la mañana
                        return true;
                    } else if (id == R.id.nav_leche_tarde) {
                        // Lógica para leche de la tarde
                        return true;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    // Manejar el error aquí, por ejemplo, mostrando un mensaje o registrando el error
                }
                return false;
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
