// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishInviteLinkSpec;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.list.SectionedListViewAdapter;
import com.contextlogic.wish.ui.components.text.RedBadgeTextView;
import com.contextlogic.wish.user.LoggedInUser;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.EnumSet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu:
//            MainMenuItem

public class MenuFragmentAdapter extends SectionedListViewAdapter
{
    static class ItemRowHolder
    {

        RedBadgeTextView badgeText;
        MainMenuItem menuItem;
        LinearLayout rowContainer;
        ImageView rowImage;
        TextView rowText;
        View sectionHeaderView;

        ItemRowHolder()
        {
        }
    }

    static class ProfileItemRowHolder
    {

        MainMenuItem menuItem;
        TextView nameText;
        LinearLayout rowContainer;
        BorderedImageView rowImage;
        View sectionHeaderView;

        ProfileItemRowHolder()
        {
        }
    }


    private EnumSet currentSet;
    private MainMenuItem selectedItem;
    private int upcomingBirthdayCount;

    public MenuFragmentAdapter(Context context)
    {
        super(context);
        updateCurrentSet();
        setUpcomingBirthdayCount(UserStatusManager.getInstance().getupcomingBirthdayCount());
    }

    private MainMenuItem getLastItemInFirstSection()
    {
        return MainMenuItem.WALLET;
    }

    protected void bindSectionHeader(View view, int i, boolean flag)
    {
        view = ((View) (view.getTag()));
        if (!(view instanceof ItemRowHolder)) goto _L2; else goto _L1
_L1:
        view = (ItemRowHolder)view;
        if (flag && getSectionForPosition(i) != 0) goto _L4; else goto _L3
_L3:
        ((ItemRowHolder) (view)).sectionHeaderView.setVisibility(8);
_L6:
        return;
_L4:
        ((ItemRowHolder) (view)).sectionHeaderView.setVisibility(0);
        return;
_L2:
        if (view instanceof ProfileItemRowHolder)
        {
            view = (ProfileItemRowHolder)view;
            if (!flag || getSectionForPosition(i) == 0)
            {
                ((ProfileItemRowHolder) (view)).sectionHeaderView.setVisibility(8);
                return;
            } else
            {
                ((ProfileItemRowHolder) (view)).sectionHeaderView.setVisibility(0);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void configurePinnedHeader(View view, int i, int j)
    {
        view.setVisibility(0);
        view = (TextView)view;
        view.setText(getSections()[getSectionForPosition(i)]);
        view.getBackground().setAlpha(j);
        view.setTextColor(j << 24 | getContext().getResources().getColor(0x7f0c00e8));
    }

    public int getCount()
    {
        return currentSet.size();
    }

    public EnumSet getCurrentMenuSet()
    {
        return currentSet;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i != 0 ? 1 : 0;
    }

    public int getPinnedHeaderState(int i)
    {
        return 0;
    }

    public int getPositionForSection(int i)
    {
        int j = 1;
        if (i == 0)
        {
            j = 0;
        } else
        if (i != 1)
        {
            return MainMenuItem.indexForItem(getLastItemInFirstSection(), currentSet) + 1;
        }
        return j;
    }

    public int getSectionForPosition(int i)
    {
        boolean flag;
        if (i <= MainMenuItem.indexForItem(getLastItemInFirstSection(), currentSet))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 0)
        {
            return 0;
        }
        return !flag ? 2 : 1;
    }

    public View getSectionedView(int i, View view, ViewGroup viewgroup)
    {
        if (i == 0)
        {
            if (view == null)
            {
                view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f030070, viewgroup, false);
                viewgroup = new ProfileItemRowHolder();
                viewgroup.rowContainer = (LinearLayout)view.findViewById(0x7f0d022f);
                viewgroup.rowImage = (BorderedImageView)view.findViewById(0x7f0d0230);
                viewgroup.nameText = (TextView)view.findViewById(0x7f0d0231);
                viewgroup.sectionHeaderView = view.findViewById(0x7f0d0233);
                ((ProfileItemRowHolder) (viewgroup)).rowImage.getImageView().setRequestedImageWidth(30);
                ((ProfileItemRowHolder) (viewgroup)).rowImage.getImageView().setRequestedImageHeight(30);
                view.setTag(viewgroup);
            } else
            {
                viewgroup = (ProfileItemRowHolder)view.getTag();
            }
            viewgroup.menuItem = MainMenuItem.resolveIndexForSet(i, currentSet);
            if (LoggedInUser.getInstance().getCurrentUser() != null)
            {
                ((ProfileItemRowHolder) (viewgroup)).rowImage.getImageView().setImageUrl(LoggedInUser.getInstance().getCurrentUser().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium));
                ((ProfileItemRowHolder) (viewgroup)).nameText.setText(LoggedInUser.getInstance().getCurrentUser().getName());
            } else
            {
                ((ProfileItemRowHolder) (viewgroup)).rowImage.getImageView().setImageUrl(null);
                ((ProfileItemRowHolder) (viewgroup)).nameText.setText("");
            }
            if (selectedItem != null && selectedItem == ((ProfileItemRowHolder) (viewgroup)).menuItem)
            {
                ((ProfileItemRowHolder) (viewgroup)).rowContainer.setBackgroundResource(0x7f0200c9);
                return view;
            } else
            {
                ((ProfileItemRowHolder) (viewgroup)).rowContainer.setBackgroundResource(0x7f0200ca);
                return view;
            }
        }
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem = new int[MainMenuItem.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.NOTIFICATIONS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.UPCOMING_BIRTHDAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.SHOPPING_CART.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.WALLET.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.PROFILE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.HOME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.SEARCH.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.INVITE_FRIENDS.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.OTHER_APPS.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.ORDER_HISTORY.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.HELP.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.FAQ.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$menu$MainMenuItem[MainMenuItem.SETTINGS.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        MainMenuItem mainmenuitem;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f03006c, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.rowContainer = (LinearLayout)view.findViewById(0x7f0d0229);
            viewgroup.rowImage = (ImageView)view.findViewById(0x7f0d022a);
            viewgroup.rowText = (TextView)view.findViewById(0x7f0d022b);
            viewgroup.badgeText = (RedBadgeTextView)view.findViewById(0x7f0d022c);
            viewgroup.sectionHeaderView = view.findViewById(0x7f0d0233);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        mainmenuitem = MainMenuItem.resolveIndexForSet(i, currentSet);
        viewgroup.menuItem = mainmenuitem;
        ((ItemRowHolder) (viewgroup)).badgeText.setVisibility(8);
        _cls1..SwitchMap.com.contextlogic.wish.ui.fragment.menu.MainMenuItem[mainmenuitem.ordinal()];
        JVM INSTR tableswitch 1 13: default 448
    //                   1 548
    //                   2 608
    //                   3 746
    //                   4 686
    //                   5 448
    //                   6 488
    //                   7 518
    //                   8 806
    //                   9 872
    //                   10 902
    //                   11 932
    //                   12 962
    //                   13 992;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_992;
_L14:
        if (selectedItem != null && selectedItem == ((ItemRowHolder) (viewgroup)).menuItem)
        {
            ((ItemRowHolder) (viewgroup)).rowContainer.setBackgroundResource(0x7f0200c9);
            return view;
        } else
        {
            ((ItemRowHolder) (viewgroup)).rowContainer.setBackgroundResource(0x7f0200ca);
            return view;
        }
_L6:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f0600af));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f020105);
          goto _L14
_L7:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f06039b));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f02011f);
          goto _L14
_L2:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f0602fc));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f02010d);
        i = UserStatusManager.getInstance().getUnviewedNotificationCount();
        if (i > 0)
        {
            ((ItemRowHolder) (viewgroup)).badgeText.setText(Integer.toString(i));
            ((ItemRowHolder) (viewgroup)).badgeText.setVisibility(0);
        }
          goto _L14
_L3:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f060452));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f020101);
        i = UserStatusManager.getInstance().getupcomingBirthdayCount();
        long l = UserPreferences.getLastBirthdayCheckTime();
        if (i > 0 && l < System.currentTimeMillis() - 0x5265c00L)
        {
            ((ItemRowHolder) (viewgroup)).badgeText.setText(Integer.toString(i));
            ((ItemRowHolder) (viewgroup)).badgeText.setVisibility(0);
        }
          goto _L14
_L5:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f060475));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f020119);
        i = UserStatusManager.getInstance().getWalletCount();
        if (i > 0)
        {
            ((ItemRowHolder) (viewgroup)).badgeText.setText(Integer.toString(i));
            ((ItemRowHolder) (viewgroup)).badgeText.setVisibility(0);
        }
          goto _L14
_L4:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f0603de));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f020126);
        i = UserStatusManager.getInstance().getCartCount();
        if (i > 0)
        {
            ((ItemRowHolder) (viewgroup)).badgeText.setText(Integer.toString(i));
            ((ItemRowHolder) (viewgroup)).badgeText.setVisibility(0);
        }
          goto _L14
_L8:
        WishInviteLinkSpec wishinvitelinkspec = UserStatusManager.getInstance().getInviteLinkSpec();
        if (wishinvitelinkspec != null && wishinvitelinkspec.getMenuText() != null)
        {
            ((ItemRowHolder) (viewgroup)).rowText.setText(wishinvitelinkspec.getMenuText());
        } else
        {
            ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f06024e));
        }
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f0200e5);
          goto _L14
_L9:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f0603da));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f020125);
          goto _L14
_L10:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f060312));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f02012f);
          goto _L14
_L11:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f06010a));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f02012a);
          goto _L14
_L12:
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f0601e5));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f020104);
          goto _L14
        ((ItemRowHolder) (viewgroup)).rowText.setText(getContext().getString(0x7f0603b5));
        ((ItemRowHolder) (viewgroup)).rowImage.setImageResource(0x7f020121);
          goto _L14
    }

    public volatile Object[] getSections()
    {
        return getSections();
    }

    public String[] getSections()
    {
        return null;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public void setSelectedItem(MainMenuItem mainmenuitem)
    {
        selectedItem = mainmenuitem;
        notifyDataSetChanged();
    }

    public void setUpcomingBirthdayCount(int i)
    {
        upcomingBirthdayCount = i;
        updateCurrentSet();
    }

    public void updateCurrentSet()
    {
        currentSet = EnumSet.copyOf(MainMenuItem.NORMAL);
        if (upcomingBirthdayCount > 0)
        {
            currentSet.addAll(MainMenuItem.BIRTHDAY);
        }
    }

    public void updateRow(View view)
    {
        view = ((View) (view.getTag()));
        if (view != null)
        {
            if ((view instanceof ProfileItemRowHolder) && LoggedInUser.getInstance().getCurrentUser() != null)
            {
                ((ProfileItemRowHolder)view).rowImage.getImageView().setImageUrl(LoggedInUser.getInstance().getCurrentUser().getProfileImage().getUrlString(com.contextlogic.wish.api.data.WishProfileImage.ImageSize.Medium));
            }
            if (view instanceof ItemRowHolder)
            {
                view = (ItemRowHolder)view;
                int l;
                switch (_cls1..SwitchMap.com.contextlogic.wish.ui.fragment.menu.MainMenuItem[((ItemRowHolder) (view)).menuItem.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    int i = UserStatusManager.getInstance().getUnviewedNotificationCount();
                    if (i > 0)
                    {
                        ((ItemRowHolder) (view)).badgeText.setText(Integer.toString(i));
                        ((ItemRowHolder) (view)).badgeText.setVisibility(0);
                        return;
                    } else
                    {
                        ((ItemRowHolder) (view)).badgeText.setVisibility(8);
                        return;
                    }

                case 2: // '\002'
                    int j = UserStatusManager.getInstance().getupcomingBirthdayCount();
                    long l1 = UserPreferences.getLastBirthdayCheckTime();
                    if (j > 0 && l1 < System.currentTimeMillis() - 0x5265c00L)
                    {
                        ((ItemRowHolder) (view)).badgeText.setText(Integer.toString(j));
                        ((ItemRowHolder) (view)).badgeText.setVisibility(0);
                        return;
                    } else
                    {
                        ((ItemRowHolder) (view)).badgeText.setVisibility(8);
                        return;
                    }

                case 3: // '\003'
                    int k = UserStatusManager.getInstance().getCartCount();
                    if (k > 0)
                    {
                        ((ItemRowHolder) (view)).badgeText.setText(Integer.toString(k));
                        ((ItemRowHolder) (view)).badgeText.setVisibility(0);
                        return;
                    } else
                    {
                        ((ItemRowHolder) (view)).badgeText.setVisibility(8);
                        return;
                    }

                case 4: // '\004'
                    l = UserStatusManager.getInstance().getWalletCount();
                    break;
                }
                if (l > 0)
                {
                    ((ItemRowHolder) (view)).badgeText.setText(Integer.toString(l));
                    ((ItemRowHolder) (view)).badgeText.setVisibility(0);
                    return;
                } else
                {
                    ((ItemRowHolder) (view)).badgeText.setVisibility(8);
                    return;
                }
            }
        }
    }
}
