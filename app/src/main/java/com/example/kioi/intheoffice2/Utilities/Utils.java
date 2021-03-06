package com.example.kioi.intheoffice2.Utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Kioi on 1/28/2018.
 */

public class Utils {

        private static final  String PREFERENCES_FILE ="materialsample_settings";

        public static String readSharedSetting(Context ctx, String settingName, String defaultValue){
            SharedPreferences sharedPref=ctx.getSharedPreferences(PREFERENCES_FILE,Context.MODE_PRIVATE);
            return sharedPref.getString(settingName,defaultValue);
        }
        public static void saveSharedSetting(Context ctx, String settingName,String settingValue){
            SharedPreferences sharedPref=ctx.getSharedPreferences(PREFERENCES_FILE,Context.MODE_PRIVATE);
            SharedPreferences.Editor editor =sharedPref.edit();
            editor.putString(settingName,settingValue);
            editor.apply();
        }
    }


