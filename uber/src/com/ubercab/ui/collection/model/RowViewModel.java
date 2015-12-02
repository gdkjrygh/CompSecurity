// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.collection.model;

import hqq;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.ubercab.ui.collection.model:
//            ViewModel, Shape_RowViewModel, DividerViewModel

public abstract class RowViewModel extends ViewModel
{

    public RowViewModel()
    {
    }

    public static RowViewModel create()
    {
        return new Shape_RowViewModel();
    }

    public static RowViewModel create(int i)
    {
        Shape_RowViewModel shape_rowviewmodel = new Shape_RowViewModel();
        shape_rowviewmodel.setPadding(i, i, i, i);
        return shape_rowviewmodel;
    }

    public abstract int getBackgroundDrawable();

    public abstract android.view.View.OnClickListener getClickListener();

    public abstract boolean getDefaultSelectBackground();

    public abstract DividerViewModel getDividerViewModel();

    public abstract List getLayoutParams();

    public abstract int getMinimumHeight();

    public int getNumberOfItems()
    {
        if (getViewModels() == null)
        {
            return 0;
        } else
        {
            return getViewModels().size();
        }
    }

    public abstract int getPaddingBottom();

    public abstract int getPaddingLeft();

    public abstract int getPaddingRight();

    public abstract int getPaddingTop();

    public hqq getParamAtPosition(int i)
    {
        return (hqq)getLayoutParams().get(i);
    }

    public ViewModel getViewModelAtPosition(int i)
    {
        return (ViewModel)getViewModels().get(i);
    }

    public abstract List getViewModels();

    public abstract RowViewModel setBackgroundDrawable(int i);

    public abstract RowViewModel setClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract RowViewModel setDefaultSelectBackground(boolean flag);

    public abstract RowViewModel setDividerViewModel(DividerViewModel dividerviewmodel);

    public abstract RowViewModel setLayoutParams(List list);

    public abstract RowViewModel setMinimumHeight(int i);

    public RowViewModel setPadding(int i, int j, int k, int l)
    {
        setPaddingLeft(i);
        setPaddingTop(j);
        setPaddingRight(k);
        return setPaddingBottom(l);
    }

    public abstract RowViewModel setPaddingBottom(int i);

    public abstract RowViewModel setPaddingLeft(int i);

    public abstract RowViewModel setPaddingRight(int i);

    public abstract RowViewModel setPaddingTop(int i);

    public RowViewModel setViewModels(ViewModel viewmodel, hqq hqq1)
    {
        setViewModels(Collections.singletonList(viewmodel));
        return setLayoutParams(Collections.singletonList(hqq1));
    }

    public RowViewModel setViewModels(ViewModel viewmodel, hqq hqq1, ViewModel viewmodel1, hqq hqq2)
    {
        setViewModels(Arrays.asList(new ViewModel[] {
            viewmodel, viewmodel1
        }));
        return setLayoutParams(Arrays.asList(new hqq[] {
            hqq1, hqq2
        }));
    }

    public RowViewModel setViewModels(ViewModel viewmodel, hqq hqq1, ViewModel viewmodel1, hqq hqq2, ViewModel viewmodel2, hqq hqq3)
    {
        setViewModels(Arrays.asList(new ViewModel[] {
            viewmodel, viewmodel1, viewmodel2
        }));
        return setLayoutParams(Arrays.asList(new hqq[] {
            hqq1, hqq2, hqq3
        }));
    }

    public RowViewModel setViewModels(ViewModel viewmodel, hqq hqq1, ViewModel viewmodel1, hqq hqq2, ViewModel viewmodel2, hqq hqq3, ViewModel viewmodel3, 
            hqq hqq4)
    {
        setViewModels(Arrays.asList(new ViewModel[] {
            viewmodel, viewmodel1, viewmodel2, viewmodel3
        }));
        return setLayoutParams(Arrays.asList(new hqq[] {
            hqq1, hqq2, hqq3, hqq4
        }));
    }

    public abstract RowViewModel setViewModels(List list);
}
