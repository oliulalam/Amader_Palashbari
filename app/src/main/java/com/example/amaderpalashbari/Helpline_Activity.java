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

public class Helpline_Activity extends AppCompatActivity {

    RecyclerView recyclerView;

    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
        recyclerView = findViewById(R.id.recyclerView);



        hashMap = new HashMap<>();
        hashMap.put("title", "নারী ও শিশু নির্যাতন প্রতিরোধ");
        hashMap.put("number", "109");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "দুর্যোগের আগাম বার্তা");
        hashMap.put("number", "1090");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "জরুরী হটলাইন নাম্বার");
        hashMap.put("number", "1৬৫৭৫");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "জাতীয় তথ্য ও সেবা");
        hashMap.put("number", "333");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কৃষি বিষয়ক তথ্য ও সেবা");
        hashMap.put("number", "16123");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "শিশু বিষয়ক সহায়তা");
        hashMap.put("number", "1098");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "দুর্নীতি দমন কমিশন");
        hashMap.put("number", "106");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সরকারি আইনি সহায়তা");
        hashMap.put("number", "16430");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "জরুরী কল সেন্টার");
        hashMap.put("number", "999");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ভূমি অফিস সেবা");
        hashMap.put("number", "16122");
        arrayList.add(hashMap);







        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(Helpline_Activity.this));



    }



    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{


        private class MyViewHolder extends RecyclerView.ViewHolder{

            TextView callCenterName, number;
            ImageView callButtonImage;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                callCenterName = itemView.findViewById(R.id.callCenterName);
                number = itemView.findViewById(R.id.number);
                callButtonImage = itemView.findViewById(R.id.callButtonImage);
            }
        }




        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View myView = layoutInflater.inflate(R.layout.helpline_layout,parent,false);
            return new MyViewHolder(myView);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String number= hashMap.get("number");

            holder.callCenterName.setText(title);
            holder.number.setText(number);




            if (position==0){
                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            } else if (position==1) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==2) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==3) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==4) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==5) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==6) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==7) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==8) {

                holder.callButtonImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel: "+number));
                        startActivity(intent);

                    }
                });

            }else if (position==9) {

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