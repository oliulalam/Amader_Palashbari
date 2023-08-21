package com.example.amaderpalashbari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.navigation.NavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    ImageView imageMenu;
    TextView tvDate, marq;

    RecyclerView recyclerView;

    ProgressBar progressBar;

    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigationView);
        imageMenu = findViewById(R.id.imageMenu);
        drawerLayout = findViewById(R.id.drawer_layout);
        tvDate = findViewById(R.id.tvDate);
        marq = findViewById(R.id.marq);
        recyclerView = findViewById(R.id.recyclerView);
//        progressBar = findViewById(R.id.progressBar);





        tvDate=findViewById(R.id.tvDate);
        //Set Date For Cover Section
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        formatter.setTimeZone(TimeZone.getDefault());
        Date date1 = new Date();
        String s_date = formatter.format(date1);
        tvDate.setText(s_date);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,
                R.string.drawer_close, R.string.drawer_open);
        drawerLayout.addDrawerListener(toggle);


        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        marq.setSelected(true);





//        String Url = "https://oliulalam.000webhostapp.com/apps/jsonarray.json";
//
//
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, Url, null, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//
//                progressBar.setVisibility(View.GONE);
//
//                try {
//
//                    for (int x=0; x<response.length(); x++) {
//
//                        JSONObject jsonObject = response.getJSONObject(x);
//                        String title = jsonObject.getString("title");
//                        String icon = jsonObject.getString("icon");
//
//                        hashMap = new HashMap<>();
//                        hashMap.put("title", title);
//                        hashMap.put("icon", icon);
//                        arrayList.add(hashMap);
//
//                    }
//
//                } catch (JSONException e) {
//                    throw new RuntimeException(e);
//                }
//
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//                progressBar.setVisibility(View.GONE);
//
//            }
//        });
//
//        RequestQueue queue = Volley.newRequestQueue(this);
//        queue.add(jsonArrayRequest);



        hashMap = new HashMap<>();
        hashMap.put("title", "হাসপাতাল");
        hashMap.put("icon", ""+R.drawable.hospital);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ডাক্তার");
        hashMap.put("icon", ""+R.drawable.doctor);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "অ্যাম্বুলেন্স");
        hashMap.put("icon", ""+R.drawable.ambulance);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "হেল্প লাইন");
        hashMap.put("icon", ""+R.drawable.helpline);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "দর্শনীয় স্থান");
        hashMap.put("icon", ""+R.drawable.place);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বিদ্যুৎ অফিস");
        hashMap.put("icon", ""+R.drawable.lightning);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ব্লাড ডোনার");
        hashMap.put("icon", ""+R.drawable.blood);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বাস কাউন্টার");
        hashMap.put("icon", ""+R.drawable.bus);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "প্রশিক্ষণ কেন্দ্র");
        hashMap.put("icon", ""+R.drawable.training);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সাংবাদিক");
        hashMap.put("icon", ""+R.drawable.interview);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "মাইক্রো/বাস");
        hashMap.put("icon", ""+R.drawable.car_driver);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "কুরিয়ার");
        hashMap.put("icon", ""+R.drawable.persal);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "আবাসিক হোটেল");
        hashMap.put("icon", ""+R.drawable.resort);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ব্যাংক");
        hashMap.put("icon", ""+R.drawable.bank);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "হোমিওপ্যাথি");
        hashMap.put("icon", ""+R.drawable.medicine);
        arrayList.add(hashMap);






        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 3));



    }

    //===================================================

    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        private class MyViewHolder extends RecyclerView.ViewHolder{

            ImageView imageView;
            TextView textView;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.imageView);
                textView = itemView.findViewById(R.id.textView);

            }
        }


        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View myView = layoutInflater.inflate(R.layout.main_activity_item, parent, false);
            return new MyViewHolder(myView);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            hashMap = arrayList.get(position);

            String title = hashMap.get("title");
            String icon = hashMap.get("icon");

            int myImage = Integer.parseInt(icon);

            holder.imageView.setImageResource(myImage);

            holder.textView.setText(title);


            if (position==0){

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, Hospital_Activity.class);
                        startActivity(intent);

                    }
                });

            } else if (position==1) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Doctor_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==2) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Ambulance_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==3) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Helpline_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==4) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Place_Watch_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==5) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Current_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==6) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Blood_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==7) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, BusCounter_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==8) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Traning_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==9) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Jornalist_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==10) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, CarBus_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==11) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Persel_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==12) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Resort_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==13) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Bank_Activity.class);
                        startActivity(intent);
                    }
                });

            }else if (position==14) {

                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Homiopathy_Activity.class);
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