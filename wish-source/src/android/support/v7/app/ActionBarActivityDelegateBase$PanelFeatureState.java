// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase

private static final class refreshDecorView
{
    private static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return SavedState.readFromParcel(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int featureId;
        boolean isOpen;
        Bundle menuState;

        private static SavedState readFromParcel(Parcel parcel)
        {
            boolean flag = true;
            SavedState savedstate = new SavedState();
            savedstate.featureId = parcel.readInt();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            savedstate.isOpen = flag;
            if (savedstate.isOpen)
            {
                savedstate.menuState = parcel.readBundle();
            }
            return savedstate;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(featureId);
            if (isOpen)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (isOpen)
            {
                parcel.writeBundle(menuState);
            }
        }



        private SavedState()
        {
        }

        SavedState(ActionBarActivityDelegateBase._cls1 _pcls1)
        {
            this();
        }
    }


    ViewGroup decorView;
    int featureId;
    Bundle frozenActionViewState;
    Bundle frozenMenuState;
    boolean isHandled;
    boolean isOpen;
    boolean isPrepared;
    ListMenuPresenter listMenuPresenter;
    Context listPresenterContext;
    MenuBuilder menu;
    public boolean qwertyMode;
    boolean refreshDecorView;
    boolean refreshMenuContent;
    View shownPanelView;
    boolean wasLastOpen;

    void applyFrozenState()
    {
        if (menu != null && frozenMenuState != null)
        {
            menu.restorePresenterStates(frozenMenuState);
            frozenMenuState = null;
        }
    }

    public void clearMenuPresenters()
    {
        if (menu != null)
        {
            menu.removeMenuPresenter(listMenuPresenter);
        }
        listMenuPresenter = null;
    }

    MenuView getListMenuView(android.support.v7.internal.view.menu.er er)
    {
        if (menu == null)
        {
            return null;
        }
        if (listMenuPresenter == null)
        {
            listMenuPresenter = new ListMenuPresenter(listPresenterContext, android.support.v7.appcompat.esenterContext);
            listMenuPresenter.setCallback(er);
            menu.addMenuPresenter(listMenuPresenter);
        }
        return listMenuPresenter.getMenuView(decorView);
    }

    public boolean hasPanelItems()
    {
        while (shownPanelView == null || listMenuPresenter.getAdapter().getCount() <= 0) 
        {
            return false;
        }
        return true;
    }

    void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        featureId = ((SavedState) (parcelable)).featureId;
        wasLastOpen = ((SavedState) (parcelable)).isOpen;
        frozenMenuState = ((SavedState) (parcelable)).menuState;
        shownPanelView = null;
        decorView = null;
    }

    Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(null);
        savedstate.featureId = featureId;
        savedstate.isOpen = isOpen;
        if (menu != null)
        {
            savedstate.menuState = new Bundle();
            menu.savePresenterStates(savedstate.menuState);
        }
        return savedstate;
    }

    void setMenu(MenuBuilder menubuilder)
    {
        if (menubuilder != menu)
        {
            if (menu != null)
            {
                menu.removeMenuPresenter(listMenuPresenter);
            }
            menu = menubuilder;
            if (menubuilder != null && listMenuPresenter != null)
            {
                menubuilder.addMenuPresenter(listMenuPresenter);
                return;
            }
        }
    }

    void setStyle(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        android.content.res.te te = context.getResources().newTheme();
        te.te(context.getTheme());
        te.te(android.support.v7.appcompat.nuPresenter, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        }
        te.te(android.support.v7.appcompat.nuPresenter, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        } else
        {
            te.te(android.support.v7.appcompat.nuPresenter, true);
        }
        context = new ContextThemeWrapper(context, 0);
        context.getTheme().te(te);
        listPresenterContext = context;
    }

    SavedState(int i)
    {
        featureId = i;
        refreshDecorView = false;
    }
}
