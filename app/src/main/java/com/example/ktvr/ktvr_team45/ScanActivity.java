package com.example.ktvr.ktvr_team45;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

public class ScanActivity extends Activity {
    ImageView iv;
    static final int CAM_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        iv = (ImageView)findViewById(R.id.ivCam);

        Intent cam_Intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file = getFile();
        cam_Intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        startActivityForResult(cam_Intent, CAM_REQUEST);
    }

    private File getFile(){
        File folder = new File("sdcard/cam_app");
        if(!folder.exists())
        {
            folder.mkdir();
        }
        File image_file = new File(folder,"cam_image.jpg");
        return  image_file;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String path = "sdcard/cam_app/cam_image.jpg";
        iv.setImageDrawable(Drawable.createFromPath(path));
    }
}
