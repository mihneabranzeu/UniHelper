package com.acidulat.unihelper.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.acidulat.unihelper.Chat.ChatActivity;
import com.acidulat.unihelper.Events.EventsActivity;
import com.acidulat.unihelper.Home.HomeActivity;
import com.acidulat.unihelper.Profile.ProfileActivity;
import com.acidulat.unihelper.R;
import com.acidulat.unihelper.Search.SearchActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
   private static final String TAG = "BottomNavigationViewHel";

   public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
       Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
       bottomNavigationViewEx.enableAnimation(false);
       bottomNavigationViewEx.setTextVisibility(false);
   }


   public static void enableNavigation(final Context context, BottomNavigationViewEx view) {
       view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               switch (menuItem.getItemId()) {
                   case R.id.ic_book :
                       Intent intent1 = new Intent(context, HomeActivity.class); //0
                       context.startActivity(intent1);
                       break;
                   case R.id.ic_search :
                       Intent intent2 = new Intent(context,SearchActivity.class); //1
                       context.startActivity(intent2);
                       break;
                   case R.id.ic_events :
                       Intent intent3 = new Intent(context,EventsActivity.class); //2
                       context.startActivity(intent3);
                       break;
                   case R.id.ic_message :
                       Intent intent4 = new Intent(context,ChatActivity.class); //3
                       context.startActivity(intent4);
                       break;
                   case R.id.ic_profile :
                       Intent intent5 = new Intent(context,ProfileActivity.class); //4
                       context.startActivity(intent5);
                       break;
               }

               return false;
           }
       });

   }
}
