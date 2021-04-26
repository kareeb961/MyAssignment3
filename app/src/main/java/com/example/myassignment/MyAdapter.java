package com.example.myassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyAdapter  extends ArrayAdapter<String>
{
    Context context;
    String Name[];
    String Email[];
    int img[];


    MyAdapter(Context c, String Name[], String Email[], int img[]){
        super(c,R.layout.all,R.id.Emaill,Name);
        context=c;
        this.Name=Name;
        this.Email=Email;
        this.img=img;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.all,parent,false);

        ImageView imgg = row.findViewById(R.id.allimage);
        TextView Namee=row.findViewById(R.id.allname);
        TextView Emaiil=row.findViewById(R.id.Emaill);

        imgg.setImageResource(img[position]);
        Namee.setText(Name[position]);
        Emaiil.setText(Email[position]);
        return row;
    }

}
