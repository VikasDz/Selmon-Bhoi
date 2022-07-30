package com.t.selmonbhoi;

import static com.t.selmonbhoi.GameView.screenRatioX;
import static com.t.selmonbhoi.GameView.screenRatioY;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class deer {

    public int speed = 10;
    public boolean wasShot = true;
    int x = 0, y, width, height, birdCounter = 1;
    Bitmap deer1, deer2, deer4, deer3;

    deer(Resources res) {

        deer1 = BitmapFactory.decodeResource(res, R.drawable.deer1);
        deer2 = BitmapFactory.decodeResource(res, R.drawable.deer2);
        deer3 = BitmapFactory.decodeResource(res, R.drawable.deer3);
        deer4 = BitmapFactory.decodeResource(res, R.drawable.deer4);

        width = deer1.getWidth();
        height = deer1.getHeight();

        width /= 4;
        height /= 4;

        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        deer1 = Bitmap.createScaledBitmap(deer1, width, height, false);
        deer2 = Bitmap.createScaledBitmap(deer2, width, height, false);
        deer3 = Bitmap.createScaledBitmap(deer3, width, height, false);
        deer4 = Bitmap.createScaledBitmap(deer4, width, height, false);

        y = -height;
    }

    Bitmap getBird () {

        if (birdCounter == 1) {
            birdCounter++;
            return deer1;
        }

        if (birdCounter == 2) {
            birdCounter++;
            return deer2;
        }

        if (birdCounter == 3) {
            birdCounter++;
            return deer3;
        }

        birdCounter = 1;

        return deer4;
    }

    Rect getCollisionShape () {
        return new Rect(x, y, x + width, y + height);
    }

}
