// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import java.lang.reflect.Constructor;

// Referenced classes of package com.actionbarsherlock.view:
//            MenuInflater, ActionMode, MenuItem, Menu, 
//            SubMenu, ActionProvider

class resetGroup
{

    private static final String z[];
    private int groupCategory;
    private int groupCheckable;
    private boolean groupEnabled;
    private int groupId;
    private int groupOrder;
    private boolean groupVisible;
    private ActionProvider itemActionProvider;
    private String itemActionProviderClassName;
    private String itemActionViewClassName;
    private int itemActionViewLayout;
    private boolean itemAdded;
    private char itemAlphabeticShortcut;
    private int itemCategoryOrder;
    private int itemCheckable;
    private boolean itemChecked;
    private boolean itemEnabled;
    private int itemIconResId;
    private int itemId;
    private String itemListenerMethodName;
    private char itemNumericShortcut;
    private int itemShowAsAction;
    private CharSequence itemTitle;
    private CharSequence itemTitleCondensed;
    private boolean itemVisible;
    private Menu menu;
    final MenuInflater this$0;

    private char getShortcut(String s)
    {
        if (s == null)
        {
            return '\0';
        } else
        {
            return s.charAt(0);
        }
    }

    private Object newInstance(String s, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = ((Class []) (MenuInflater.access$100(MenuInflater.this).getClassLoader().loadClass(s).getConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            Log.w(z[3], (new StringBuilder()).append(z[2]).append(s).toString(), aclass);
            return null;
        }
        return aclass;
    }

    private void setItem(MenuItem menuitem)
    {
        int j;
        j = ActionMode.a;
        Object obj;
        int i;
        boolean flag1;
        try
        {
            obj = menuitem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled);
            i = itemCheckable;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (i >= 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        try
        {
            ((MenuItem) (obj)).setCheckable(flag1).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId).setAlphabeticShortcut(itemAlphabeticShortcut).setNumericShortcut(itemNumericShortcut);
            if (itemShowAsAction >= 0)
            {
                menuitem.setShowAsAction(itemShowAsAction);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        obj = itemListenerMethodName;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        try
        {
            if (MenuInflater.access$100(MenuInflater.this).isRestricted())
            {
                throw new IllegalStateException(z[4]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        break MISSING_BLOCK_LABEL_162;
        menuitem;
        throw menuitem;
        menuitem.setOnMenuItemClickListener(new MenuItemClickListener(MenuInflater.access$400(MenuInflater.this), itemListenerMethodName));
        boolean flag2;
        try
        {
            if (itemCheckable < 2)
            {
                break MISSING_BLOCK_LABEL_236;
            }
            flag2 = menuitem instanceof MenuItemImpl;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
        if (flag2)
        {
            MenuItemImpl menuitemimpl = (MenuItemImpl)menuitem;
            int k;
            try
            {
                menuitemimpl.setExclusiveCheckable(true);
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_236;
            }
        }
        menu.setGroupCheckable(groupId, true, true);
label0:
        {
            boolean flag;
            if (itemActionViewClassName != null)
            {
                menuitem.setActionView((View)newInstance(itemActionViewClassName, MenuInflater.access$500(), MenuInflater.access$600(MenuInflater.this)));
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                k = itemActionViewLayout;
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
            if (k <= 0)
            {
                break label0;
            }
            if (!flag)
            {
                menuitem.setActionView(itemActionViewLayout);
                if (j == 0)
                {
                    break label0;
                }
            }
            try
            {
                Log.w(z[5], z[6]);
            }
            // Misplaced declaration of an exception variable
            catch (MenuItem menuitem)
            {
                throw menuitem;
            }
        }
        try
        {
            if (itemActionProvider != null)
            {
                menuitem.setActionProvider(itemActionProvider);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MenuItem menuitem)
        {
            throw menuitem;
        }
    }

    public void addItem()
    {
        itemAdded = true;
        setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
    }

    public SubMenu addSubMenuItem()
    {
        itemAdded = true;
        SubMenu submenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
        setItem(submenu.getItem());
        return submenu;
    }

    public boolean hasAddedItem()
    {
        return itemAdded;
    }

    public void readGroup(AttributeSet attributeset)
    {
        int i = ActionMode.a;
        attributeset = MenuInflater.access$100(MenuInflater.this).obtainStyledAttributes(attributeset, com.actionbarsherlock.uGroup);
        try
        {
            groupId = attributeset.getResourceId(com.actionbarsherlock.uGroup_android_id, 0);
            groupCategory = attributeset.getInt(com.actionbarsherlock.uGroup_android_menuCategory, 0);
            groupOrder = attributeset.getInt(com.actionbarsherlock.uGroup_android_orderInCategory, 0);
            groupCheckable = attributeset.getInt(com.actionbarsherlock.uGroup_android_checkableBehavior, 0);
            groupVisible = attributeset.getBoolean(com.actionbarsherlock.uGroup_android_visible, true);
            groupEnabled = attributeset.getBoolean(com.actionbarsherlock.uGroup_android_enabled, true);
            attributeset.recycle();
            if (SherlockActivity.a)
            {
                ActionMode.a = i + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            throw attributeset;
        }
    }

    public void readItem(AttributeSet attributeset)
    {
        TypedArray typedarray;
        int i;
        int j;
        int k;
        int l;
        j = 1;
        k = ActionMode.a;
        typedarray = MenuInflater.access$100(MenuInflater.this).obtainStyledAttributes(attributeset, com.actionbarsherlock.uItem);
        itemId = typedarray.getResourceId(com.actionbarsherlock.uItem_android_id, 0);
        i = typedarray.getInt(com.actionbarsherlock.uItem_android_menuCategory, groupCategory);
        l = typedarray.getInt(com.actionbarsherlock.uItem_android_orderInCategory, groupOrder);
        boolean flag;
        itemCategoryOrder = i & 0xffff0000 | l & 0xffff;
        itemTitle = typedarray.getText(com.actionbarsherlock.uItem_android_title);
        itemTitleCondensed = typedarray.getText(com.actionbarsherlock.uItem_android_titleCondensed);
        itemIconResId = typedarray.getResourceId(com.actionbarsherlock.uItem_android_icon, 0);
        itemAlphabeticShortcut = getShortcut(typedarray.getString(com.actionbarsherlock.uItem_android_alphabeticShortcut));
        itemNumericShortcut = getShortcut(typedarray.getString(com.actionbarsherlock.uItem_android_numericShortcut));
        flag = typedarray.hasValue(com.actionbarsherlock.uItem_android_checkable);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        try
        {
            flag = typedarray.getBoolean(com.actionbarsherlock.uItem_android_checkable, false);
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            throw attributeset;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        itemCheckable = i;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        try
        {
            flag = SherlockActivity.a;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            throw attributeset;
        }
        if (flag)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        SherlockActivity.a = flag;
        itemCheckable = groupCheckable;
        itemChecked = typedarray.getBoolean(com.actionbarsherlock.uItem_android_checked, false);
        itemVisible = typedarray.getBoolean(com.actionbarsherlock.uItem_android_visible, groupVisible);
        itemEnabled = typedarray.getBoolean(com.actionbarsherlock.uItem_android_enabled, groupEnabled);
        attributeset = new TypedValue();
        typedarray.getValue(com.actionbarsherlock.uItem_android_showAsAction, attributeset);
        if (((TypedValue) (attributeset)).type != 17) goto _L2; else goto _L1
_L1:
        i = ((TypedValue) (attributeset)).data;
_L7:
        itemShowAsAction = i;
        itemListenerMethodName = typedarray.getString(com.actionbarsherlock.uItem_android_onClick);
        itemActionViewLayout = typedarray.getResourceId(com.actionbarsherlock.uItem_android_actionLayout, 0);
        attributeset = new TypedValue();
        typedarray.getValue(com.actionbarsherlock.uItem_android_actionViewClass, attributeset);
        if (((TypedValue) (attributeset)).type != 3) goto _L4; else goto _L3
_L3:
        attributeset = ((TypedValue) (attributeset)).string.toString();
_L8:
        itemActionViewClassName = attributeset;
        attributeset = new TypedValue();
        typedarray.getValue(com.actionbarsherlock.uItem_android_actionProviderClass, attributeset);
        if (((TypedValue) (attributeset)).type != 3) goto _L6; else goto _L5
_L5:
        attributeset = ((TypedValue) (attributeset)).string.toString();
_L9:
        try
        {
            itemActionProviderClassName = attributeset;
            attributeset = itemActionProviderClassName;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            throw attributeset;
        }
        if (attributeset != null)
        {
            i = j;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        j = itemActionViewLayout;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        attributeset = itemActionViewClassName;
        if (attributeset != null)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        itemActionProvider = (ActionProvider)newInstance(itemActionProviderClassName, MenuInflater.access$200(), MenuInflater.access$300(MenuInflater.this));
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        if (i != 0)
        {
            try
            {
                Log.w(z[0], z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                throw attributeset;
            }
        }
        itemActionProvider = null;
        typedarray.recycle();
        itemAdded = false;
        return;
        attributeset;
        throw attributeset;
        attributeset;
        throw attributeset;
        attributeset;
        throw attributeset;
_L2:
        i = -1;
          goto _L7
        attributeset;
        throw attributeset;
_L4:
        attributeset = null;
          goto _L8
        attributeset;
        throw attributeset;
_L6:
        attributeset = null;
          goto _L9
        attributeset;
        try
        {
            throw attributeset;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset) { }
        try
        {
            throw attributeset;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset) { }
        throw attributeset;
          goto _L7
    }

    public void resetGroup()
    {
        groupId = 0;
        groupCategory = 0;
        groupOrder = 0;
        groupCheckable = 0;
        groupVisible = true;
        groupEnabled = true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "\035& 8+>%\",\02651";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\031$ \"\0209-)m\003$7<$\000%7+mE1 :$\r>\023<\"\0249'+?!<\"=>E~c\017.\0269, m\0249&9m\003<1+,\006)c==\0073*($\0074m";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\023\" #\r$c'#\021$\" 9\01317+m\001<\"=>Xp";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\035& 8+>%\",\02651";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\004++m\003>'<\"\0134y!#!<*-&B17:?\01326:(B3\" #\r$c,(B%0+)B'*:%\013>c/m\02050:?\01337+)B3, 9\007(7";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\035& 8+>%\",\02651";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\031$ \"\0209-)m\003$7<$\000%7+mE97+ #37'\"\f\006*+:.1:!8\026wmn\f\001$*!#B&*+:B1/<(\0034:n>\0225 '+\0135'`";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 98;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 80;
          goto _L9
_L5:
        byte1 = 67;
          goto _L9
_L6:
        byte1 = 78;
          goto _L9
        byte1 = 77;
          goto _L9
    }


    public mpl(Menu menu1)
    {
        this$0 = MenuInflater.this;
        super();
        menu = menu1;
        resetGroup();
    }
}
