package com.example.matheusmaxwellmeireles.apprevisao.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.matheusmaxwellmeireles.apprevisao.Model.Car;
import com.example.matheusmaxwellmeireles.apprevisao.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Car> cars;

    public MyAdapter(Context context, ArrayList<Car> cars) {
        this.context = context;
        this.cars = cars;
    }

    @Override
    public int getCount() {
        return cars.size();
    }


    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Car car = cars.get(position);

        if(convertView == null){
            convertView = View.inflate(context, R.layout.adapter_loyout, null);
        }

        TextView name = convertView.findViewById(R.id.name);
        ImageView imageView = convertView.findViewById(R.id.image);

        name.setText(car.getNome());
        imageView.setImageResource(car.getFoto());


        return convertView;
    }
}
