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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
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

private class avatarView
    implements android.view.ClickListener
{
    private class AvatarOptionsClickListener
        implements android.widget.AdapterView.OnItemClickListener
    {

        private final AlertDialog dialog;
        final AccountSettingsFragment.AvatarOnClickListener this$1;

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
            Picasso.with(getActivity()).load(com.weather.commons.R.drawable.default_avatar).transform(new CircleImageTransform(getResources().getDimensionPixelSize(com.weather.commons.R.dimen.account_settings_avatar_size))).noFade().into((ImageView)AccountSettingsFragment.access$2300(this$0).findViewById(com.weather.commons.R.id.account_settings_avatar));
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.UPS_AVATAR_URI, "");
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_CUSTOM_AVATAR, false);
        }

        private void takePhoto()
        {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try
            {
                AccountSettingsFragment.access$2202(this$0, getFileForCamera());
                if (intent.resolveActivity(AccountSettingsFragment.access$600(this$0).getPackageManager()) != null)
                {
                    intent.putExtra("output", Uri.fromFile(AccountSettingsFragment.access$2200(this$0)));
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
        //                       0 36
        //                       1 43
        //                       2 62;
               goto _L1 _L2 _L3 _L4
_L1:
            dialog.dismiss();
            return;
_L2:
            takePhoto();
            continue; /* Loop/switch isn't completed */
_L3:
            AccountSettingsFragment.access$302(this$0, false);
            selectImageFromGallery();
            continue; /* Loop/switch isn't completed */
_L4:
            setAvatarToDefaultImage();
            if (true) goto _L1; else goto _L5
_L5:
        }

        AvatarOptionsClickListener(AlertDialog alertdialog)
        {
            this$1 = AccountSettingsFragment.AvatarOnClickListener.this;
            super();
            dialog = alertdialog;
        }
    }


    final ImageView avatarView;
    final AccountSettingsFragment this$0;

    public void onClick(View view)
    {
        if (AccountSettingsFragment.access$600(AccountSettingsFragment.this) == null)
        {
            return;
        } else
        {
            view = new android.app.nClickListener.this._cls0(AccountSettingsFragment.access$600(AccountSettingsFragment.this));
            ListView listview = new ListView(AccountSettingsFragment.access$600(AccountSettingsFragment.this));
            String as[] = getResources().getStringArray(com.weather.commons.stener.this._fld0);
            listview.setAdapter(new ArrayAdapter(AccountSettingsFragment.access$600(AccountSettingsFragment.this), 0x1090003, 0x1020014, as));
            view._mth0(listview);
            view._mth0(getString(com.weather.commons.stener.this._fld0));
            listview.setOnItemClickListener(new AvatarOptionsClickListener(view.nClickListener()));
            return;
        }
    }

    AvatarOptionsClickListener.dialog(ImageView imageview)
    {
        this$0 = AccountSettingsFragment.this;
        super();
        avatarView = imageview;
    }
}
