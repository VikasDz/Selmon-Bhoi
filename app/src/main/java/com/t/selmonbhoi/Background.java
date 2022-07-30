package com.t.selmonbhoi;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Background {

    int x = 0, y = 0;
    Bitmap background;

    Background (int screenX, int screenY, Resources res) {

        background = BitmapFactory.decodeResource(res, R.drawable.nature);
        background = Bitmap.createScaledBitmap(background, screenX, screenY, false);

    }

}
