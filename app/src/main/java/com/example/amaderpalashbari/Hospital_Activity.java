package com.example.amaderpalashbari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital_Activity extends AppCompatActivity {

    RecyclerView recyclerView;

    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        recyclerView = findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();



        hashMap = new HashMap<>();
        hashMap.put("hospital", "পলাশবাড়ী উপজেলা স্বাস্থ্য কমপ্লেক্স");
        hashMap.put("address", "পলাশবাড়ী,গাইবান্ধা.");
        hashMap.put("number", "01730324648");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("hospital", "পলাশবাড়ী চক্ষু হাসপাতাল");
        hashMap.put("address", "পলাশবাড়ী,গাইবান্ধা.");
        hashMap.put("number", "01714800876");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("hospital", "সেবা হেলথ্ এন্ড আই কেয়ার সেন্টার");
        hashMap.put("address", "বেলেরঘাট রোড,গৃধারীপুর,পলাশবাড়ী,গাইবান্ধা.");
        hashMap.put("number", "01717607022");
        arrayList.add(hashMap);






        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(Hospital_Activity.this));




    }


    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        private class MyViewHolder extends RecyclerView.ViewHolder{

            ImageView callButtonImage ;
            TextView hospitalNumber, hospitalAdress, hospitalName;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                callButtonImage = itemView.findViewById(R.id.callButtonImage);
                hospitalName = itemView.findViewById(R.id.hospitalName);;
                hospitalAdress = itemView.findViewById(R.id.hospitalAdress);
                hospitalNumber = itemView.findViewById(R.id.hospitalNumber);

            }
        }



        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inflater = getLayoutInflater();
            View MyView = inflater.inflate(R.layout.hospital_layout, parent, false);
            return new MyViewHolder(MyView);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


            hashMap = arrayList.get(position);

            String hospital = hashMap.get("hospital");
            String address = hashMap.get("address");
            String number = hashMap.get("number");

            holder.hospitalName.setText(hospital);
            holder.hospitalAdress.setText(address);
            holder.hospitalNumber.setText(number);



            if (position==0){
                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            } else if (position==2) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==1) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }


    }

}