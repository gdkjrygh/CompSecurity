// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import java.util.ArrayList;
import java.util.Iterator;

public class DialogHelper
{
    public static interface DialogHolder
    {

        public abstract Dialog createDialog(int i, Bundle bundle);

        public abstract void prepareDialog(int i, Dialog dialog, Bundle bundle);

        public abstract void showedDialog(int i, Dialog dialog, Bundle bundle);
    }

    public static interface DialogUpdater
    {

        public abstract int getDialogId();

        public abstract void update(Dialog dialog);
    }

    private static class ManagedDialog
    {

        Bundle args;
        Dialog dialog;
        int id;

        private ManagedDialog()
        {
        }

    }


    private static final int DEFAULT_DIALOG_LIST_CAPACITY = 5;
    private static final String KEY_SAVED_DIALOG_IDS = "ids";
    private static final String PREFIX_KEY_SAVED_DIALOG = "d_";
    private static final String PREFIX_KEY_SAVED_DIALOG_ARGS = "a_";
    protected static final String TAG = com/wsi/android/framework/ui/utils/DialogHelper.getSimpleName();
    private static final String TAG_SAVED_DIALOGS = "dialogs";
    private boolean destroyed;
    private DialogHolder holder;
    private SparseArray managedDialogs;
    private ArrayList showing;
    private boolean started;

    public DialogHelper(DialogHolder dialogholder)
    {
        showing = new ArrayList(5);
        managedDialogs = new SparseArray(5);
        holder = dialogholder;
    }

    private Dialog createDialog(final int dialogId, Bundle bundle)
    {
        bundle = holder.createDialog(dialogId, bundle);
        if (bundle == null)
        {
            return null;
        } else
        {
            bundle.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final DialogHelper this$0;
                final int val$dialogId;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    Log.d(DialogHelper.TAG, (new StringBuilder()).append("onDismiss: dialog = ").append(dialoginterface).append("; id = ").append(dialogId).toString());
                    removeFromShowing(dialogId);
                }

            
            {
                this$0 = DialogHelper.this;
                dialogId = i;
                super();
            }
            });
            bundle.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

                final DialogHelper this$0;
                final int val$dialogId;

                public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
                {
                    Log.d(DialogHelper.TAG, (new StringBuilder()).append("onKey: dialog = ").append(dialoginterface).append("; id = ").append(dialogId).append("; key = ").append(keyevent).toString());
                    return i == 84;
                }

            
            {
                this$0 = DialogHelper.this;
                dialogId = i;
                super();
            }
            });
            return bundle;
        }
    }

    private void removeFromShowing(ManagedDialog manageddialog)
    {
        showing.remove(manageddialog);
    }

    private static String savedDialogArgsKeyFor(int i)
    {
        return (new StringBuilder()).append("a_").append(i).toString();
    }

    private static String savedDialogKeyFor(int i)
    {
        return (new StringBuilder()).append("d_").append(i).toString();
    }

    public void dismissDialog(int i)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.w(TAG, (new StringBuilder()).append("dismissDialog: id = ").append(i).toString());
        }
        ManagedDialog manageddialog = (ManagedDialog)managedDialogs.get(i);
        if (manageddialog != null && manageddialog.dialog != null)
        {
            manageddialog.dialog.dismiss();
            removeFromShowing(manageddialog);
        }
    }

    public void onDestroy()
    {
        destroyed = true;
        for (Iterator iterator = showing.iterator(); iterator.hasNext(); ((ManagedDialog)iterator.next()).dialog.dismiss()) { }
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        bundle = bundle.getBundle("dialogs");
        if (bundle != null)
        {
            int ai[] = bundle.getIntArray("ids");
            int j = ai.length;
            int i = 0;
            while (i < j) 
            {
                Integer integer = Integer.valueOf(ai[i]);
                Bundle bundle1 = bundle.getBundle(savedDialogKeyFor(integer.intValue()));
                if (bundle1 != null)
                {
                    ManagedDialog manageddialog = new ManagedDialog();
                    manageddialog.args = bundle.getBundle(savedDialogArgsKeyFor(integer.intValue()));
                    manageddialog.dialog = createDialog(integer.intValue(), manageddialog.args);
                    if (manageddialog.dialog != null)
                    {
                        manageddialog.id = integer.intValue();
                        managedDialogs.put(manageddialog.id, manageddialog);
                        holder.prepareDialog(manageddialog.id, manageddialog.dialog, manageddialog.args);
                        manageddialog.dialog.onRestoreInstanceState(bundle1);
                        if (manageddialog.dialog.isShowing())
                        {
                            holder.showedDialog(manageddialog.id, manageddialog.dialog, manageddialog.args);
                        }
                    }
                }
                i++;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        int j = managedDialogs.size();
        if (j == 0)
        {
            return;
        }
        Bundle bundle1 = new Bundle();
        int ai[] = new int[managedDialogs.size()];
        for (int i = 0; i < j; i++)
        {
            int k = managedDialogs.keyAt(i);
            ai[i] = k;
            ManagedDialog manageddialog = (ManagedDialog)managedDialogs.valueAt(i);
            bundle1.putBundle(savedDialogKeyFor(k), manageddialog.dialog.onSaveInstanceState());
            if (manageddialog.args != null)
            {
                bundle1.putBundle(savedDialogArgsKeyFor(k), manageddialog.args);
            }
        }

        bundle1.putIntArray("ids", ai);
        bundle.putBundle("dialogs", bundle1);
    }

    public void onStart()
    {
        Iterator iterator;
        started = true;
        iterator = showing.iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ManagedDialog manageddialog = (ManagedDialog)iterator.next();
        Throwable throwable;
        boolean flag;
        if (!manageddialog.dialog.isShowing())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        manageddialog.dialog.show();
        if (flag)
        {
            try
            {
                holder.showedDialog(manageddialog.id, manageddialog.dialog, manageddialog.args);
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                Log.w(TAG, "could not show dialog");
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onStop()
    {
        started = false;
        for (Iterator iterator = showing.iterator(); iterator.hasNext(); ((ManagedDialog)iterator.next()).dialog.hide()) { }
    }

    public void removeDialog(int i)
    {
        ManagedDialog manageddialog = (ManagedDialog)managedDialogs.get(i);
        if (manageddialog != null)
        {
            if (manageddialog.dialog.isShowing())
            {
                removeFromShowing(manageddialog);
            }
            manageddialog.dialog.dismiss();
            managedDialogs.remove(i);
        }
    }

    protected void removeFromShowing(int i)
    {
        removeFromShowing((ManagedDialog)managedDialogs.get(i));
    }

    public boolean showDialog(int i)
    {
        boolean flag;
        try
        {
            flag = showDialog(i, null);
        }
        catch (Throwable throwable)
        {
            Log.e(TAG, "could not show dialog");
            return false;
        }
        return flag;
    }

    public boolean showDialog(int i, Bundle bundle)
    {
        if (!destroyed) goto _L2; else goto _L1
_L1:
        if (ConfigInfo.DEBUG)
        {
            Log.w(TAG, (new StringBuilder()).append("showDialog: already destroyed!!! id = ").append(i).toString());
        }
_L4:
        return false;
_L2:
        ManagedDialog manageddialog;
        ManagedDialog manageddialog1 = (ManagedDialog)managedDialogs.get(i);
        manageddialog = manageddialog1;
        if (manageddialog1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        manageddialog = new ManagedDialog();
        manageddialog.dialog = createDialog(i, bundle);
        if (manageddialog.dialog == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        manageddialog.id = i;
        managedDialogs.put(i, manageddialog);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        manageddialog.args = bundle;
        holder.prepareDialog(i, manageddialog.dialog, manageddialog.args);
        if (!manageddialog.dialog.isShowing())
        {
            showing.add(manageddialog);
            if (started)
            {
                manageddialog.dialog.show();
                holder.showedDialog(i, manageddialog.dialog, manageddialog.args);
            }
        }
        return true;
    }

    public void updateDialog(DialogUpdater dialogupdater)
    {
        if (destroyed)
        {
            if (ConfigInfo.DEBUG)
            {
                Log.w(TAG, "updateDialog: try to update dialog after destroy");
            }
        } else
        {
            ManagedDialog manageddialog = (ManagedDialog)managedDialogs.get(dialogupdater.getDialogId());
            if (manageddialog != null && manageddialog.dialog != null && manageddialog.dialog.isShowing())
            {
                dialogupdater.update(manageddialog.dialog);
                return;
            }
        }
    }

}
