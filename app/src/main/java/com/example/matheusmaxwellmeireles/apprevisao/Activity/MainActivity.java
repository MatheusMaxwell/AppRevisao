package com.example.matheusmaxwellmeireles.apprevisao.Activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.matheusmaxwellmeireles.apprevisao.Adapter.MyAdapter;
import com.example.matheusmaxwellmeireles.apprevisao.Model.Car;
import com.example.matheusmaxwellmeireles.apprevisao.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    GridView gridView;
    ArrayList<Car> cars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createListCars();

        gridView = findViewById(R.id.grid);
        gridView.setAdapter(new MyAdapter(MainActivity.this, cars));

    }

    public void createListCars (){
        cars = new ArrayList<>();
        Car car;
        car = new Car("Gol", R.drawable.gol);
        cars.add(car);
        car = new Car("Celta", R.drawable.celta);
        cars.add(car);
        car = new Car("Uno", R.drawable.uno);
        cars.add(car);
        car = new Car("Gol", R.drawable.gol);
        cars.add(car);
        car = new Car("Celta", R.drawable.celta);
        cars.add(car);
        car = new Car("Uno", R.drawable.uno);
        cars.add(car);
        car = new Car("Gol", R.drawable.gol);
        cars.add(car);
        car = new Car("Celta", R.drawable.celta);
        cars.add(car);
        car = new Car("Uno", R.drawable.uno);
        cars.add(car);
    }
}
