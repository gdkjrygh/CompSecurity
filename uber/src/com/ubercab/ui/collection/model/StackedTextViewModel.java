// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.collection.model;


// Referenced classes of package com.ubercab.ui.collection.model:
//            ViewModel, Shape_StackedTextViewModel, TextViewModel

public abstract class StackedTextViewModel extends ViewModel
{

    public StackedTextViewModel()
    {
    }

    public static StackedTextViewModel create()
    {
        return new Shape_StackedTextViewModel();
    }

    public static StackedTextViewModel create(TextViewModel textviewmodel, TextViewModel textviewmodel1)
    {
        StackedTextViewModel stackedtextviewmodel = create();
        stackedtextviewmodel.setPrimaryTextModel(textviewmodel);
        stackedtextviewmodel.setSecondaryTextModel(textviewmodel1);
        return stackedtextviewmodel;
    }

    public abstract TextViewModel getPrimaryTextModel();

    public abstract TextViewModel getSecondaryTextModel();

    public abstract int getSpacingBetweenText();

    public abstract StackedTextViewModel setPrimaryTextModel(TextViewModel textviewmodel);

    public abstract StackedTextViewModel setSecondaryTextModel(TextViewModel textviewmodel);

    public abstract StackedTextViewModel setSpacingBetweenText(int i);
}
