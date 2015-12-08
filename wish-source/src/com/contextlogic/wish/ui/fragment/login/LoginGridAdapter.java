// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.content.Context;
import android.content.res.Resources;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewAdapter;
import com.contextlogic.wish.util.TabletUtil;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            LoginGridCellView

public class LoginGridAdapter
    implements StaggeredGridViewAdapter
{
    private static class ImageHolder
    {

        public double aspectRatio;
        public int resourceId;

        public ImageHolder(int i, double d)
        {
            resourceId = i;
            aspectRatio = d;
        }
    }


    private Context context;
    private StaggeredGridView gridView;
    private ArrayList imageData;

    public LoginGridAdapter(Context context1, StaggeredGridView staggeredgridview)
    {
        context = context1;
        gridView = staggeredgridview;
        initializeData();
    }

    private void initializeData()
    {
        HashMap hashmap;
        HashMap hashmap1;
        int i;
        imageData = new ArrayList();
        hashmap = new HashMap();
        hashmap1 = new HashMap();
        i = 0;
_L7:
        if (i >= 10) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (i >= 40)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!hashmap.containsKey(Integer.valueOf(j)))
        {
            break; /* Loop/switch isn't completed */
        }
        double d = ((Double)hashmap.get(Integer.valueOf(j))).doubleValue();
        if (d == 0.0D)
        {
            continue; /* Loop/switch isn't completed */
        }
        imageData.add(new ImageHolder(((Integer)hashmap1.get(Integer.valueOf(j))).intValue(), d));
_L5:
        j++;
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            int k = context.getResources().getIdentifier((new StringBuilder()).append("splash_contest_").append(j).toString(), "string", context.getPackageName());
            if (k == 0)
            {
                break label0;
            }
            double d1 = Double.parseDouble(context.getString(k));
            k = context.getResources().getIdentifier((new StringBuilder()).append("splash_contest_").append(j).toString(), "drawable", context.getPackageName());
            if (k != 0)
            {
                hashmap1.put(Integer.valueOf(j), Integer.valueOf(k));
                imageData.add(new ImageHolder(k, d1));
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        hashmap.put(Integer.valueOf(j), Double.valueOf(0.0D));
        i++;
          goto _L7
_L2:
    }

    public int getHeightForViewAtIndex(int i, int j)
    {
        ImageHolder imageholder = (ImageHolder)imageData.get(i);
        return (int)((double)j * imageholder.aspectRatio);
    }

    public int getNumColumnsInLandscape()
    {
        return !TabletUtil.isTablet(context) ? 2 : 4;
    }

    public int getNumColumnsInPortrait()
    {
        return !TabletUtil.isTablet(context) ? 2 : 3;
    }

    public int getNumItems()
    {
        return imageData.size();
    }

    public int getScreenWidthOverride()
    {
        return 0;
    }

    public StaggeredGridCellView getViewAtIndex(int i, int j, boolean flag)
    {
        ImageHolder imageholder = (ImageHolder)imageData.get(i);
        LoginGridCellView logingridcellview1 = (LoginGridCellView)gridView.dequeueView("LoginCell");
        LoginGridCellView logingridcellview = logingridcellview1;
        if (logingridcellview1 == null)
        {
            logingridcellview = new LoginGridCellView(context);
            logingridcellview.setIdentifier("LoginCell");
        }
        logingridcellview.setImage(imageholder.resourceId);
        return logingridcellview;
    }

    public boolean overrideScreenWidth()
    {
        return false;
    }
}
