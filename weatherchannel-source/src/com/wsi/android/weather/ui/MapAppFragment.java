// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.ui;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import com.wsi.android.framework.ui.utils.ComponentsProvider;
import com.wsi.android.framework.ui.utils.DialogHelper;
import com.wsi.android.weather.utils.settings.MapSettingsAccessor;
import com.wsi.android.weather.utils.settings.MapSkinSettings;

// Referenced classes of package com.wsi.android.weather.ui:
//            MapApplication

public abstract class MapAppFragment extends Fragment
    implements com.wsi.android.framework.ui.utils.DialogHelper.DialogHolder
{

    private static final int INVALID_VIEW_ID = -1;
    private final String TAG = getClass().getSimpleName();
    protected boolean appeared;
    protected ComponentsProvider componentsProvider;
    protected DialogHelper dialogHelper;
    protected android.widget.RelativeLayout.LayoutParams layoutParams;
    protected MapApplication mapApp;
    protected View v;

    public MapAppFragment()
    {
    }

    public Dialog createDialog(int i, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("createDialog: id  = ").append(i).toString());
        }
        return null;
    }

    protected View doCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "doCreateView");
        }
        bundle = layoutinflater.inflate(getLayout(), viewgroup, false);
        int i = getViewForBackground();
        if (i != -1)
        {
            android.graphics.drawable.Drawable drawable = mapApp.getSettingsAccessor().getSkinSettings().getBackgroundImage();
            if (drawable != null)
            {
                bundle.findViewById(i).setBackgroundDrawable(drawable);
            }
        }
        generateContentLayoutParams();
        initializeContent(layoutinflater, viewgroup, bundle);
        return bundle;
    }

    protected void generateContentLayoutParams()
    {
    }

    public DialogHelper getDialogHelper()
    {
        return dialogHelper;
    }

    public int getEnterAnimation()
    {
        return 0;
    }

    public int getExitAnimation()
    {
        return 0;
    }

    protected abstract int getLayout();

    protected int getRequestedOrientation()
    {
        byte byte0 = 1;
        boolean flag;
        if ((mapApp.getApplicationContext().getResources().getConfiguration().screenLayout & 0xf) >= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            byte0 = 4;
        }
        return byte0;
    }

    protected abstract String getScreenName();

    protected int getViewForBackground()
    {
        return -1;
    }

    public boolean hasInternalBackStack()
    {
        return false;
    }

    protected void initializeContent(LayoutInflater layoutinflater, ViewGroup viewgroup, View view)
    {
    }

    protected boolean isFirstTimeAppeared()
    {
        return appeared;
    }

    public void onAttach(Activity activity)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onAttach");
        }
        super.onAttach(activity);
        mapApp = (MapApplication)activity.getApplicationContext();
        componentsProvider = (ComponentsProvider)activity;
        if (dialogHelper == null)
        {
            dialogHelper = new DialogHelper(this);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("onConfigurationChanged: ").append(configuration).toString());
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onCreate");
        }
        super.onCreate(bundle);
        onRestoreInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onCreateView");
        }
        if (v == null)
        {
            v = doCreateView(layoutinflater, viewgroup, bundle);
        }
        if (v != null)
        {
            if (v.getParent() != null)
            {
                ((ViewGroup)v.getParent()).removeView(v);
            }
            if (layoutParams != null)
            {
                v.setLayoutParams(layoutParams);
            }
        }
        return v;
    }

    public void onDestroy()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onDestroy");
        }
        super.onDestroy();
        v = null;
        dialogHelper.onDestroy();
    }

    public void onDestroyView()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onDestroyView");
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onDetach");
        }
        super.onDetach();
    }

    protected void onFirstTimeAppeared()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onFirstTimeAppeared");
        }
    }

    public void onPause()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onPause");
        }
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("onRestoreInstanceState: savedInstanceState = ").append(bundle).toString());
        }
        if (bundle != null)
        {
            dialogHelper.onRestoreInstanceState(bundle);
        }
    }

    public void onResume()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onResume");
        }
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onSaveInstanceState");
        }
        super.onSaveInstanceState(bundle);
        dialogHelper.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onStart");
        }
        super.onStart();
        getActivity().setRequestedOrientation(getRequestedOrientation());
        dialogHelper.onStart();
        if (!appeared)
        {
            appeared = true;
            onFirstTimeAppeared();
        }
    }

    public void onStop()
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, "onStop");
        }
        super.onStop();
        dialogHelper.onStop();
    }

    public boolean popInternalBackStack()
    {
        return false;
    }

    public void prepareDialog(int i, Dialog dialog, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("prepareDialog: id  = ").append(i).append("; d = ").append(dialog).toString());
        }
    }

    public void showedDialog(int i, Dialog dialog, Bundle bundle)
    {
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("showedDialog: id  = ").append(i).append("; d = ").append(dialog).toString());
        }
    }
}
