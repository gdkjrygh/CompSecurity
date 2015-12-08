// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import net.hockeyapp.android.views.PaintView;

// Referenced classes of package net.hockeyapp.android:
//            Strings

public class PaintActivity extends Activity
{

    private static final int MENU_CLEAR_ID = 3;
    private static final int MENU_SAVE_ID = 1;
    private static final int MENU_UNDO_ID = 2;
    private String imageName;
    private PaintView paintView;

    public PaintActivity()
    {
    }

    private String determineFilename(Uri uri, String s)
    {
        Cursor cursor;
        Object obj1 = null;
        Object obj = null;
        cursor = getApplicationContext().getContentResolver().query(uri, new String[] {
            "_data"
        }, null, null, null);
        uri = obj1;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        uri = obj;
        if (cursor.moveToFirst())
        {
            uri = cursor.getString(0);
        }
        cursor.close();
        if (uri == null)
        {
            return s;
        } else
        {
            return (new File(uri)).getName();
        }
        uri;
        cursor.close();
        throw uri;
    }

    private void makeResult()
    {
        Object obj = new File(getCacheDir(), "HockeyApp");
        ((File) (obj)).mkdir();
        File file = new File(((File) (obj)), imageName);
        for (int i = 1; file.exists(); i++)
        {
            file = new File(((File) (obj)), (new StringBuilder()).append(imageName).append("_").append(i).toString());
        }

        paintView.setDrawingCacheEnabled(true);
        (new AsyncTask() {

            final PaintActivity this$0;
            final Bitmap val$bitmap;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((File[])aobj);
            }

            protected transient Void doInBackground(File afile[])
            {
                try
                {
                    afile = new FileOutputStream(afile[0]);
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, afile);
                    afile.close();
                }
                // Misplaced declaration of an exception variable
                catch (File afile[])
                {
                    afile.printStackTrace();
                    Log.e("HockeyApp", "Could not save image.", afile);
                }
                return null;
            }

            
            {
                this$0 = PaintActivity.this;
                bitmap = bitmap1;
                super();
            }
        }).execute(new File[] {
            file
        });
        obj = new Intent();
        ((Intent) (obj)).putExtra("imageUri", Uri.fromFile(file));
        if (getParent() == null)
        {
            setResult(-1, ((Intent) (obj)));
        } else
        {
            getParent().setResult(-1, ((Intent) (obj)));
        }
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (Uri)getIntent().getExtras().getParcelable("imageUri");
        imageName = determineFilename(bundle, bundle.getLastPathSegment());
        int j = getResources().getDisplayMetrics().widthPixels;
        int k = getResources().getDisplayMetrics().heightPixels;
        int i;
        int l;
        if (j > k)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        l = PaintView.determineOrientation(getContentResolver(), bundle);
        setRequestedOrientation(l);
        if (i != l)
        {
            Log.d("HockeyApp", "Image loading skipped because activity will be destroyed for orientation change.");
            return;
        } else
        {
            paintView = new PaintView(this, bundle, j, k);
            bundle = new LinearLayout(this);
            bundle.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            bundle.setGravity(17);
            bundle.setOrientation(1);
            LinearLayout linearlayout = new LinearLayout(this);
            linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            linearlayout.setGravity(17);
            linearlayout.setOrientation(0);
            bundle.addView(linearlayout);
            linearlayout.addView(paintView);
            setContentView(bundle);
            Toast.makeText(this, Strings.get(1536), 1000).show();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, Strings.get(1537));
        menu.add(0, 2, 0, Strings.get(1538));
        menu.add(0, 3, 0, Strings.get(1539));
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && !paintView.isClear())
        {
            keyevent = new android.content.DialogInterface.OnClickListener() {

                final PaintActivity this$0;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    switch (j)
                    {
                    default:
                        return;

                    case -1: 
                        finish();
                        break;
                    }
                }

            
            {
                this$0 = PaintActivity.this;
                super();
            }
            };
            (new android.app.AlertDialog.Builder(this)).setMessage(Strings.get(1540)).setPositiveButton(Strings.get(1542), keyevent).setNegativeButton(Strings.get(1541), keyevent).show();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 1: // '\001'
            makeResult();
            return true;

        case 2: // '\002'
            paintView.undo();
            return true;

        case 3: // '\003'
            paintView.clearImage();
            break;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        return true;
    }
}
