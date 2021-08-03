package com.info.lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

public class GameActivity extends AppCompatActivity {
    private Context mContext;

    private ImageView imageview11;
    private ImageView imageview12;
    private ImageView imageview13;
    private ImageView imageview21;
    private ImageView imageview22;
    private ImageView imageview23;
    private ImageView imageview31;
    private ImageView imageview32;
    private ImageView imageview33;
    private TextView textViewSonuc;
    private int playerTurn=1;

// 1 = tom , 2= jerry
    //chartutucu has random different numbers
    private int chartutucu11=20;
    private int chartutucu12=21;
    private int chartutucu13=22;
    private int chartutucu21=23;
    private int chartutucu22=24;
    private int chartutucu23=25;
    private int chartutucu31=26;
    private int chartutucu32=27;
    private int chartutucu33=28;

    private int berabere=30;

    //beraberlik için hamle sayar
    private int hamlesayısı=0;

    private FirebaseDatabase database;
    private DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("xox");


        Resimler resim10 = new Resimler("","33","resimm");

        /*myRef.push().setValue(resim1);
        myRef.push().setValue(resim2);
        myRef.push().setValue(resim3);
        myRef.push().setValue(resim4);
        myRef.push().setValue(resim5);
        myRef.push().setValue(resim6);
        myRef.push().setValue(resim7);
        myRef.push().setValue(resim8);
        myRef.push().setValue(resim9);*/

        imageview11=findViewById(R.id.imageView11);
        imageview12=findViewById(R.id.imageView12);
        imageview13=findViewById(R.id.imageView13);
        imageview21=findViewById(R.id.imageView21);
        imageview22=findViewById(R.id.imageView22);
        imageview23=findViewById(R.id.imageView23);
        imageview31=findViewById(R.id.imageView31);
        imageview32=findViewById(R.id.imageView32);
        imageview33=findViewById(R.id.imageView33);


        imageview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mBr8uV3kg4LYcF").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("11");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview11);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                    chartutucu11=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mBr8uV3kg4LYcF").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("11");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview11);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                    chartutucu11=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });

        imageview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mEyTOSi4aQh8qV").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("12");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview12);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                    chartutucu12=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mEyTOSi4aQh8qV").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("12");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview12);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                    chartutucu12=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });
        imageview13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mF3ws4Taijn_Os").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("13");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview13);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                    chartutucu13=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mF3ws4Taijn_Os").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("13");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview13);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                    chartutucu13=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });
        imageview21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mGxllg3zK0GGzC").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("21");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview21);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                    chartutucu21=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mGxllg3zK0GGzC").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("21");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();

                                resim.setResim_key(key);

                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview21);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                    chartutucu21=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });
        imageview22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mGxllg3zK0GGzD").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("22");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview22);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    chartutucu22=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mGxllg3zK0GGzD").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("22");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview22);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {     }
                    });
                    chartutucu22=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });
        imageview23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mI3H_x7h-h7Xoi").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("23");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview23);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    chartutucu23=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mI3H_x7h-h7Xoi").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("23");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview23);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {     }
                    });
                    chartutucu23=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });
        imageview31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mI3H_x7h-h7Xoj").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("31");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview31);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    chartutucu31=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mI3H_x7h-h7Xoj").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("31");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview31);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {     }
                    });
                    chartutucu31=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });
        imageview32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mJFi-bQ7M-rxvs").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("32");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview32);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    chartutucu32=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mJFi-bQ7M-rxvs").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("32");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview32);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {     }
                    });
                    chartutucu32=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });
        imageview33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hamlesayısı++;
                Map<String,Object> bilgiler = new HashMap<>();

                if(playerTurn%2==0){
                    bilgiler.put("resim_ad","inception");
                    myRef.child("-MM6a-mKRr-H1lIO95ih").updateChildren(bilgiler);

                    Query resimlerSorgu = myRef.orderByChild("resim_no").equalTo("33");
                    resimlerSorgu.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview33);
                                Log.e("mesaj",resim.getResim_ad());
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                    chartutucu33=2;
                }else {
                    bilgiler.put("resim_ad","interstellar");
                    myRef.child("-MM6a-mKRr-H1lIO95ih").updateChildren(bilgiler);
                    Query resimlerSorgu1 = myRef.orderByChild("resim_no").equalTo("33");
                    resimlerSorgu1.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            for(DataSnapshot d:snapshot.getChildren()){
                                Resimler resim=d.getValue(Resimler.class);
                                String key = d.getKey();
                                resim.setResim_key(key);
                                Log.e("resim_key",resim.getResim_key());
                                Log.e("resim_ad",resim.getResim_ad());
                                Log.e("resim_no",resim.getResim_no());
                                Log.e("***","****");
                                String url="http://kasimadalan.pe.hu/filmler/resimler/"+resim.getResim_ad()+".png";
                                Picasso.get().load(url).into(imageview33);
                                Log.e("mesaj",resim.getResim_ad());

                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {     }
                    });
                    chartutucu33=1;
                }
                durumKontrol();
                playerTurn++;
            }
        });

    }
    public void durumKontrol(){
        if(chartutucu11==chartutucu12&& chartutucu13==chartutucu12){
            alertView(chartutucu11);

        }else if(chartutucu11==chartutucu21 && chartutucu21==chartutucu31){
            alertView(chartutucu11);

        }else if(chartutucu31==chartutucu32&&chartutucu32==chartutucu33){
            alertView(chartutucu31);

        }else if(chartutucu13==chartutucu23&&chartutucu23==chartutucu33){
            alertView(chartutucu13);

        }else if(chartutucu21==chartutucu22&&chartutucu21==chartutucu23){
            alertView(chartutucu21);

        }else if(chartutucu11==chartutucu22&&chartutucu22==chartutucu33){
            alertView(chartutucu11);

        }else if(chartutucu13==chartutucu22&&chartutucu31==chartutucu22){
            alertView(chartutucu13);

        }else if(chartutucu12==chartutucu22&&chartutucu22==chartutucu32){
            alertView(chartutucu12);

        }else if(hamlesayısı>=9){
            alertView(berabere);
        }

    }

    public void alertView(int chartutucu){
        AlertDialog.Builder ad =new AlertDialog.Builder(GameActivity.this);
        ad.setMessage("GAME OVER");
        if(chartutucu==30){
            ad.setTitle("Draw");
        }else if(chartutucu%2==0){
            ad.setTitle("Inception WON");
        }else{
            ad.setTitle("Interstellar WON");
        }
        ad.setIcon(R.drawable.zar);

        ad.setPositiveButton("PLAY AGAIN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if(1==1){sıfırlama();}
                startActivity(new Intent(GameActivity.this,MainActivity.class));

            }
        });
        ad.create().show();
    }
    public void sıfırlama(){
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d:snapshot.getChildren()){
                    Resimler resim=d.getValue(Resimler.class);
                    String key = d.getKey();
                    resim.setResim_key(key);
                    Log.e("resim_key",resim.getResim_key());
                    Log.e("resim_ad",resim.getResim_ad());
                    Log.e("resim_no",resim.getResim_no());
                    Log.e("***","****");
                    Map<String,Object> bilgiler = new HashMap<>();

                    bilgiler.put("resim_ad","resimm");
                    myRef.child(key).updateChildren(bilgiler);
                    Log.e("mesaj",resim.getResim_ad());

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {     }
        });
    }

}