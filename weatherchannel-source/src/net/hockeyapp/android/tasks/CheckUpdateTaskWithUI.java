// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import net.hockeyapp.android.Strings;
import net.hockeyapp.android.UpdateActivity;
import net.hockeyapp.android.UpdateFragment;
import net.hockeyapp.android.UpdateManagerListener;
import net.hockeyapp.android.utils.Util;
import net.hockeyapp.android.utils.VersionCache;
import org.json.JSONArray;

// Referenced classes of package net.hockeyapp.android.tasks:
//            CheckUpdateTask

public class CheckUpdateTaskWithUI extends CheckUpdateTask
{

    private Activity activity;
    private AlertDialog dialog;
    protected boolean isDialogRequired;

    public CheckUpdateTaskWithUI(WeakReference weakreference, String s, String s1, UpdateManagerListener updatemanagerlistener, boolean flag)
    {
        super(weakreference, s, s1, updatemanagerlistener);
        activity = null;
        dialog = null;
        isDialogRequired = false;
        if (weakreference != null)
        {
            activity = (Activity)weakreference.get();
        }
        isDialogRequired = flag;
    }

    private void showDialog(final JSONArray updateInfo)
    {
        if (getCachingEnabled())
        {
            VersionCache.setVersionInfo(activity, updateInfo.toString());
        }
        if (activity == null || activity.isFinishing())
        {
            return;
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setTitle(Strings.get(listener, 513));
        if (!mandatory.booleanValue())
        {
            builder.setMessage(Strings.get(listener, 514));
            builder.setNegativeButton(Strings.get(listener, 515), new android.content.DialogInterface.OnClickListener() {

                final CheckUpdateTaskWithUI this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    cleanUp();
                }

            
            {
                this$0 = CheckUpdateTaskWithUI.this;
                super();
            }
            });
            builder.setPositiveButton(Strings.get(listener, 516), new android.content.DialogInterface.OnClickListener() {

                final CheckUpdateTaskWithUI this$0;
                final JSONArray val$updateInfo;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (getCachingEnabled())
                    {
                        VersionCache.setVersionInfo(activity, "[]");
                    }
                    dialoginterface = new WeakReference(activity);
                    if (Util.fragmentsSupported().booleanValue() && Util.runsOnTablet(dialoginterface).booleanValue())
                    {
                        showUpdateFragment(updateInfo);
                        return;
                    } else
                    {
                        startUpdateIntent(updateInfo, Boolean.valueOf(false));
                        return;
                    }
                }

            
            {
                this$0 = CheckUpdateTaskWithUI.this;
                updateInfo = jsonarray;
                super();
            }
            });
            dialog = builder.create();
            dialog.show();
            return;
        } else
        {
            Toast.makeText(activity, Strings.get(listener, 512), 1).show();
            startUpdateIntent(updateInfo, Boolean.valueOf(true));
            return;
        }
    }

    private void showUpdateFragment(JSONArray jsonarray)
    {
        Object obj;
        FragmentTransaction fragmenttransaction;
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        fragmenttransaction = activity.getFragmentManager().beginTransaction();
        fragmenttransaction.setTransition(4097);
        obj = activity.getFragmentManager().findFragmentByTag("hockey_update_dialog");
        if (obj != null)
        {
            fragmenttransaction.remove(((android.app.Fragment) (obj)));
        }
        fragmenttransaction.addToBackStack(null);
        obj = net/hockeyapp/android/UpdateFragment;
        if (listener != null)
        {
            obj = listener.getUpdateFragmentClass();
        }
        ((DialogFragment)((Class) (obj)).getMethod("newInstance", new Class[] {
            org/json/JSONArray, java/lang/String
        }).invoke(null, new Object[] {
            jsonarray, getURLString("apk")
        })).show(fragmenttransaction, "hockey_update_dialog");
        return;
        Exception exception;
        exception;
        Log.d("HockeyApp", "An exception happened while showing the update fragment:");
        exception.printStackTrace();
        Log.d("HockeyApp", "Showing update activity instead.");
        startUpdateIntent(jsonarray, Boolean.valueOf(false));
        return;
    }

    private void startUpdateIntent(JSONArray jsonarray, Boolean boolean1)
    {
        Class class1 = null;
        if (listener != null)
        {
            class1 = listener.getUpdateActivityClass();
        }
        Object obj = class1;
        if (class1 == null)
        {
            obj = net/hockeyapp/android/UpdateActivity;
        }
        if (activity != null)
        {
            Intent intent = new Intent();
            intent.setClass(activity, ((Class) (obj)));
            intent.putExtra("json", jsonarray.toString());
            intent.putExtra("url", getURLString("apk"));
            activity.startActivity(intent);
            if (boolean1.booleanValue())
            {
                activity.finish();
            }
        }
        cleanUp();
    }

    protected void cleanUp()
    {
        super.cleanUp();
        activity = null;
        dialog = null;
    }

    public void detach()
    {
        super.detach();
        activity = null;
        if (dialog != null)
        {
            dialog.dismiss();
            dialog = null;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((JSONArray)obj);
    }

    protected void onPostExecute(JSONArray jsonarray)
    {
        super.onPostExecute(jsonarray);
        if (jsonarray != null && isDialogRequired)
        {
            showDialog(jsonarray);
        }
    }



}
