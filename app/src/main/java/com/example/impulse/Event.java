package com.example.impulse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Event extends AppCompatActivity {
    ListView lst;
    String[] eventname={
            "IMPULSE",
            "Inauguration",
            "Logo and T-shirt launch",
            "Pulwama Theme Dance ",
            "Voice of Impulse",
            "Battle of Beats",
            "Group Song",
            "MixTape Dance",
            "Drama",
            "College Band Performance",
            "REVOLUTION",
            "IMPULSE",
            "Inauguration Song",
            "Impulse Movie Screening",
            "Nostalgia",
            "Hiphop",
            "Couple Dance",
            "Song Performance",
            "4th Year Performance",
            "Bollywood",
            "Special Surprize",
            "Ramp On Fire",
            "Prize Distribution",
            "RAJ BARMAN",
            "DJ AAVISH"

            };
    String[] eventname2={
            "DAY 1",
            "Inauguration Dance by 3rd Year \n Inauguration song",
            "official Logo and T-shirt launch Event",
            "In memory of our brave soldier",
            "Voice of Impulse is the song competition of BIT ",
            " ",
            "Performed by 3rd Year",
            "",
            "",
            "",
            "Live Concert",
            "DAY 2",
            "",
            "",
            "Brief of Nostalgia by AGS and Cs along with T-shirt Auction",
            "",
            "",
            "Song perfomance by 3rd year",
            "",
            "",
            "",
            "One of a kind Fashion Show in Kolkata",
            "",
            "Live Performance In Jai Hind Auditorium",
            "Live At Jai Hind Auditorium"


            };

    Integer[] imgid={
            R.drawable.logo,
            R.drawable.groupdance,
            R.drawable.logo,
            R.drawable.pulwama,
            R.drawable.voice,
            R.drawable.dance,
            R.drawable.white,
            R.drawable.dance,
            R.drawable.drama,
            R.drawable.band,
            R.drawable.revolution,
            R.drawable.logo,
            R.drawable.songsss,
            R.drawable.white,
            R.drawable.white,
            R.drawable.dance2,
            R.drawable.couple,
            R.drawable.songsss,
            R.drawable.white,
            R.drawable.bollywood,
            R.drawable.surprize,
            R.drawable.rof,
            R.drawable.prize,
            R.drawable.rajbarman,
            R.drawable.dj
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_event);



        lst=findViewById(R.id.listview);

        CustomListview customListview=new CustomListview(this,eventname,eventname2,imgid);
        lst.setAdapter(customListview);

    }
}
