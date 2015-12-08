// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.util.bitmaps.CircleImageTransform;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

private class dialog
    implements android.widget.ickListener
{

    private final AlertDialog dialog;
    final setAvatarToDefaultImage this$1;

    private File getFileForCamera()
        throws IOException
    {
        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (file == null || !file.exists())
        {
            throw new IOException("Unable to find an external public directory");
        } else
        {
            return new File(file, "ProfileImage.jpg");
        }
    }

    private void selectImageFromGallery()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(intent, 1);
    }

    private void setAvatarToDefaultImage()
    {
        Picasso.with(getActivity()).load(com.weather.commons.stener).transform(new CircleImageTransform(getResources().getDimensionPixelSize(com.weather.commons.stener))).noFade().into((ImageView)AccountSettingsFragment.access$2300(this._cls1.this.dialog).findViewById(com.weather.commons.stener.this._fld1));
        TwcPrefs.getInstance().putString(com.weather.util.prefs.ner.this._fld1, "");
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.ner.this._fld1, false);
    }

    private void takePhoto()
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        try
        {
            AccountSettingsFragment.access$2202(_fld1, getFileForCamera());
            if (intent.resolveActivity(AccountSettingsFragment.access$600(this._cls1.this.getFileForCamera).getPackageManager()) != null)
            {
                intent.putExtra("output", Uri.fromFile(AccountSettingsFragment.access$2200(_fld1)));
                startActivityForResult(intent, 2);
            }
            return;
        }
        catch (IOException ioexception)
        {
            LogUtil.e("AccountSettingsFragment", LoggingMetaTags.TWC_UPS, "Unable to create file for image storage", new Object[] {
                ioexception
            });
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 36
    //                   1 43
    //                   2 62;
           goto _L1 _L2 _L3 _L4
_L1:
        dialog.dismiss();
        return;
_L2:
        takePhoto();
        continue; /* Loop/switch isn't completed */
_L3:
        AccountSettingsFragment.access$302(this._cls1.this.takePhoto, false);
        selectImageFromGallery();
        continue; /* Loop/switch isn't completed */
_L4:
        setAvatarToDefaultImage();
        if (true) goto _L1; else goto _L5
_L5:
    }

    i(AlertDialog alertdialog)
    {
        this$1 = this._cls1.this;
        super();
        dialog = alertdialog;
    }
}
