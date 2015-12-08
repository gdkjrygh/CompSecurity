// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.debug;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.StoredPreferences;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.android.photo.util.integration.AppIntegrationFactory;

// Referenced classes of package com.walmartlabs.android.photo.util.debug:
//            PhotoDebugSettings

public class PhotoDebugSettingsUtils
{

    private static final String SERVER_NAMES[] = {
        "Mock", "Staging (s1)", "Staging (s2)", "Production"
    };
    private static final int SERVER_TYPES[] = {
        0, 1, 2, -1
    };
    private static final String TAG = com/walmartlabs/android/photo/util/debug/PhotoDebugSettingsUtils.getSimpleName();
    private static final String UPLOAD_OPTIONS[] = {
        "Always reupload", "Upload if not already uploaded"
    };

    public PhotoDebugSettingsUtils()
    {
    }

    public static AlertDialog buildPhotoDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Photo Settings");
        boolean flag = PhotoDebugSettings.get(context).displayUploadSpeed();
        String s;
        if (flag)
        {
            s = "Hide upload speed";
        } else
        {
            s = "Display upload speed";
        }
        context = new android.content.DialogInterface.OnClickListener(context, flag) {

            final Context val$context;
            final boolean val$displayUploadSpeed;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    PhotoDebugSettingsUtils.showSelectServerDialog(context);
                    return;

                case 1: // '\001'
                    PhotoLogger.get().d(PhotoDebugSettingsUtils.TAG, "Clearing settings...");
                    StoredPreferences.get(context).clearAll();
                    return;

                case 2: // '\002'
                    PhotoDebugSettingsUtils.showUploadOptionsDialog(context);
                    return;

                case 3: // '\003'
                    dialoginterface = new Intent();
                    dialoginterface.setAction("com.google.android.c2dm.intent.RECEIVE");
                    dialoginterface.addCategory("com.walmart.android");
                    dialoginterface.putExtra("photo-message", "{ \"title\" : \"GCM Test Title\", \"message\" : \"GCM Test Message\" }");
                    context.sendOrderedBroadcast(dialoginterface, null);
                    return;

                case 4: // '\004'
                    dialoginterface = PhotoDebugSettings.get(context);
                    break;
                }
                boolean flag1;
                if (!displayUploadSpeed)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                dialoginterface.setDisplayUploadSpeed(flag1);
            }

            
            {
                context = context1;
                displayUploadSpeed = flag;
                super();
            }
        };
        builder.setItems(new String[] {
            "Select server", "Clear settings/prefs", "Upload options", "Test GCM notification", s
        }, context);
        return builder.create();
    }

    public static String getDebugServerTypeString(Context context)
    {
        switch (PhotoDebugSettings.get(context).getDebugServerType())
        {
        default:
            return "";

        case 0: // '\0'
            return "Mocked";

        case 1: // '\001'
            return "Staging";

        case 2: // '\002'
            return "Staging (s2)";
        }
    }

    public static boolean isDebugMode(Context context)
    {
        return AppIntegrationFactory.create(context).isDebugMode();
    }

    public static void showSelectServerDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder;
        builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Select server");
        PhotoDebugSettings.get(context).getDebugServerType();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 74
    //                   1 79
    //                   2 84;
           goto _L1 _L2 _L3 _L4
_L1:
        byte byte0 = 3;
_L6:
        builder.setSingleChoiceItems(SERVER_NAMES, byte0, new android.content.DialogInterface.OnClickListener(byte0, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i != selectedIndex)
                {
                    PhotoDebugSettings.get(context).setDebugServerType(PhotoDebugSettingsUtils.SERVER_TYPES[i]);
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
        });
        builder.show();
        return;
_L2:
        byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        byte0 = 2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void showUploadOptionsDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Upload options");
        int i;
        if (PhotoDebugSettings.get(context).alwaysReupload())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        builder.setSingleChoiceItems(UPLOAD_OPTIONS, i, new android.content.DialogInterface.OnClickListener(i, context) {

            final Context val$context;
            final int val$selectedIndex;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (j != selectedIndex)
                {
                    PhotoDebugSettings photodebugsettings = PhotoDebugSettings.get(context);
                    boolean flag;
                    if (j == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    photodebugsettings.setAlwaysReupload(flag);
                }
                dialoginterface.dismiss();
            }

            
            {
                selectedIndex = i;
                context = context1;
                super();
            }
        });
        builder.show();
    }



}
