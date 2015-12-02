// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.actionbarsherlock.view:
//            ActionMode, ActionProvider, Menu

public class MenuInflater
{

    private static final Class ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE[];
    private static final Class ACTION_VIEW_CONSTRUCTOR_SIGNATURE[];
    private static final String z[];
    private final Object mActionProviderConstructorArguments[];
    private final Object mActionViewConstructorArguments[];
    private Context mContext;
    private Object mRealOwner;

    public MenuInflater(Context context)
    {
        mContext = context;
        mRealOwner = context;
        mActionViewConstructorArguments = (new Object[] {
            context
        });
        mActionProviderConstructorArguments = mActionViewConstructorArguments;
    }

    public MenuInflater(Context context, Object obj)
    {
        mContext = context;
        mRealOwner = obj;
        mActionViewConstructorArguments = (new Object[] {
            context
        });
        mActionProviderConstructorArguments = mActionViewConstructorArguments;
    }

    private void parseMenu(XmlPullParser xmlpullparser, AttributeSet attributeset, Menu menu)
    {
        MenuState menustate;
        boolean flag;
        boolean flag1;
        int j;
        int k;
        k = ActionMode.a;
        menustate = new MenuState(menu);
        int i = xmlpullparser.getEventType();
        do
        {
            if (i == 2)
            {
                menu = xmlpullparser.getName();
                if (menu.equals(z[2]))
                {
                    j = xmlpullparser.next();
                    if (k == 0)
                    {
                        break;
                    }
                }
                try
                {
                    throw new RuntimeException((new StringBuilder()).append(z[4]).append(menu).toString());
                }
                // Misplaced declaration of an exception variable
                catch (XmlPullParser xmlpullparser)
                {
                    throw xmlpullparser;
                }
            }
            j = xmlpullparser.next();
            i = j;
        } while (j != 1);
        flag = false;
        menu = null;
        flag1 = false;
_L6:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j;
        JVM INSTR tableswitch 1 3: default 156
    //                   1 466
    //                   2 170
    //                   3 515;
           goto _L1 _L2 _L3 _L4
_L1:
        j = xmlpullparser.next();
        if (k == 0) goto _L6; else goto _L5
_L5:
        return;
_L3:
        if (flag1 && k == 0) goto _L1; else goto _L7
_L7:
        String s = xmlpullparser.getName();
        boolean flag2 = s.equals(z[3]);
        if (!flag2) goto _L9; else goto _L8
_L8:
        menustate.readGroup(attributeset);
        if (k == 0) goto _L1; else goto _L9
_L9:
        flag2 = s.equals(z[1]);
        if (!flag2) goto _L11; else goto _L10
_L10:
        try
        {
            menustate.readItem(attributeset);
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            throw xmlpullparser;
        }
        if (k == 0) goto _L1; else goto _L11
_L11:
        flag2 = s.equals(z[7]);
        if (!flag2) goto _L13; else goto _L12
_L12:
        parseMenu(xmlpullparser, attributeset, ((Menu) (menustate.addSubMenuItem())));
        if (k == 0) goto _L1; else goto _L13
_L13:
        if (k == 0) goto _L15; else goto _L14
_L14:
        flag1 = true;
        menu = s;
_L4:
        s = xmlpullparser.getName();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        try
        {
            flag2 = s.equals(menu);
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            throw xmlpullparser;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        menu = null;
        flag1 = false;
          goto _L1
        xmlpullparser;
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        throw xmlpullparser;
        flag2 = s.equals(z[8]);
        if (!flag2) goto _L17; else goto _L16
_L16:
        menustate.resetGroup();
        if (k == 0) goto _L1; else goto _L17
_L17:
        flag2 = s.equals(z[6]);
        if (!flag2) goto _L19; else goto _L18
_L18:
        flag2 = menustate.hasAddedItem();
        if (flag2) goto _L1; else goto _L20
_L20:
        ActionProvider actionprovider = menustate.itemActionProvider;
        if (actionprovider == null) goto _L22; else goto _L21
_L21:
        flag2 = menustate.itemActionProvider.hasSubMenu();
        if (!flag2) goto _L22; else goto _L23
_L23:
        menustate.addSubMenuItem();
        if (k == 0) goto _L1; else goto _L22
_L22:
        try
        {
            menustate.addItem();
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            throw xmlpullparser;
        }
        if (k == 0) goto _L1; else goto _L19
_L19:
        flag2 = s.equals(z[0]);
        if (!flag2) goto _L1; else goto _L24
_L24:
        if (k == 0) goto _L25; else goto _L2
_L2:
        try
        {
            throw new RuntimeException(z[5]);
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser)
        {
            throw xmlpullparser;
        }
        xmlpullparser;
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        try
        {
            throw xmlpullparser;
        }
        // Misplaced declaration of an exception variable
        catch (XmlPullParser xmlpullparser) { }
        throw xmlpullparser;
_L15:
        menu = s;
        flag1 = true;
          goto _L1
_L25:
        flag = true;
          goto _L1
    }

    public void inflate(int i, Menu menu)
    {
        XmlResourceParser xmlresourceparser;
        XmlResourceParser xmlresourceparser1;
        XmlResourceParser xmlresourceparser2;
        xmlresourceparser = null;
        xmlresourceparser2 = null;
        xmlresourceparser1 = null;
        XmlResourceParser xmlresourceparser3 = mContext.getResources().getLayout(i);
        xmlresourceparser1 = xmlresourceparser3;
        xmlresourceparser = xmlresourceparser3;
        xmlresourceparser2 = xmlresourceparser3;
        parseMenu(xmlresourceparser3, Xml.asAttributeSet(xmlresourceparser3), menu);
        if (xmlresourceparser3 != null)
        {
            xmlresourceparser3.close();
        }
        return;
        menu;
        xmlresourceparser = xmlresourceparser1;
        throw new InflateException(z[10], menu);
        menu;
        if (xmlresourceparser != null)
        {
            try
            {
                xmlresourceparser.close();
            }
            // Misplaced declaration of an exception variable
            catch (Menu menu)
            {
                throw menu;
            }
        }
        throw menu;
        menu;
        xmlresourceparser = xmlresourceparser2;
        throw new InflateException(z[9], menu);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "i<|A";
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
                obj = "m-wY";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "i<|A";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "c+}Ah";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "A!bQ{p0|S8i<|A4$>}@8";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Q7wLha:fQ|$<|P8k?2Pwg,\177Qvp";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "m-wY";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "i<|A";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "c+}Ah";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "A+`[j$0|Rte-{Z\177$4wZm$\001_x";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "A+`[j$0|Rte-{Z\177$4wZm$\001_x";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                ACTION_VIEW_CONSTRUCTOR_SIGNATURE = (new Class[] {
                    android/content/Context
                });
                ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 340
    //                   0 363
    //                   1 369
    //                   2 376
    //                   3 383;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_383;
_L3:
        byte byte1 = 24;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 4;
          goto _L9
_L5:
        byte1 = 89;
          goto _L9
_L6:
        byte1 = 18;
          goto _L9
        byte1 = 52;
          goto _L9
    }







    private class MenuState
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
                aclass = ((Class []) (mContext.getClassLoader().loadClass(s).getConstructor(aclass).newInstance(aobj)));
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
                if (mContext.isRestricted())
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
            menuitem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(mRealOwner, itemListenerMethodName));
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
                    menuitem.setActionView((View)newInstance(itemActionViewClassName, MenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, mActionViewConstructorArguments));
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
            attributeset = mContext.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockMenuGroup);
            try
            {
                groupId = attributeset.getResourceId(com.actionbarsherlock.R.styleable.SherlockMenuGroup_android_id, 0);
                groupCategory = attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockMenuGroup_android_menuCategory, 0);
                groupOrder = attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockMenuGroup_android_orderInCategory, 0);
                groupCheckable = attributeset.getInt(com.actionbarsherlock.R.styleable.SherlockMenuGroup_android_checkableBehavior, 0);
                groupVisible = attributeset.getBoolean(com.actionbarsherlock.R.styleable.SherlockMenuGroup_android_visible, true);
                groupEnabled = attributeset.getBoolean(com.actionbarsherlock.R.styleable.SherlockMenuGroup_android_enabled, true);
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
            typedarray = mContext.obtainStyledAttributes(attributeset, com.actionbarsherlock.R.styleable.SherlockMenuItem);
            itemId = typedarray.getResourceId(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_id, 0);
            i = typedarray.getInt(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_menuCategory, groupCategory);
            l = typedarray.getInt(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_orderInCategory, groupOrder);
            boolean flag;
            itemCategoryOrder = i & 0xffff0000 | l & 0xffff;
            itemTitle = typedarray.getText(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_title);
            itemTitleCondensed = typedarray.getText(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_titleCondensed);
            itemIconResId = typedarray.getResourceId(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_icon, 0);
            itemAlphabeticShortcut = getShortcut(typedarray.getString(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_alphabeticShortcut));
            itemNumericShortcut = getShortcut(typedarray.getString(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_numericShortcut));
            flag = typedarray.hasValue(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_checkable);
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_199;
            }
            try
            {
                flag = typedarray.getBoolean(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_checkable, false);
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
            itemChecked = typedarray.getBoolean(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_checked, false);
            itemVisible = typedarray.getBoolean(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_visible, groupVisible);
            itemEnabled = typedarray.getBoolean(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_enabled, groupEnabled);
            attributeset = new TypedValue();
            typedarray.getValue(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_showAsAction, attributeset);
            if (((TypedValue) (attributeset)).type != 17) goto _L2; else goto _L1
_L1:
            i = ((TypedValue) (attributeset)).data;
_L7:
            itemShowAsAction = i;
            itemListenerMethodName = typedarray.getString(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_onClick);
            itemActionViewLayout = typedarray.getResourceId(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_actionLayout, 0);
            attributeset = new TypedValue();
            typedarray.getValue(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_actionViewClass, attributeset);
            if (((TypedValue) (attributeset)).type != 3) goto _L4; else goto _L3
_L3:
            attributeset = ((TypedValue) (attributeset)).string.toString();
_L8:
            itemActionViewClassName = attributeset;
            attributeset = new TypedValue();
            typedarray.getValue(com.actionbarsherlock.R.styleable.SherlockMenuItem_android_actionProviderClass, attributeset);
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
            itemActionProvider = (ActionProvider)newInstance(itemActionProviderClassName, MenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, mActionProviderConstructorArguments);
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
        //                       0 259
        //                       1 266
        //                       2 273
        //                       3 280;
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


        public MenuState(Menu menu1)
        {
            this$0 = MenuInflater.this;
            super();
            menu = menu1;
            resetGroup();
        }

        private class InflatedOnMenuItemClickListener
            implements MenuItem.OnMenuItemClickListener
        {

            private static final Class PARAM_TYPES[];
            private static final String z[];
            private Method mMethod;
            private Object mRealOwner;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                try
                {
                    if (mMethod.getReturnType() == Boolean.TYPE)
                    {
                        return ((Boolean)mMethod.invoke(mRealOwner, new Object[] {
                            menuitem
                        })).booleanValue();
                    }
                    mMethod.invoke(mRealOwner, new Object[] {
                        menuitem
                    });
                }
                // Misplaced declaration of an exception variable
                catch (MenuItem menuitem)
                {
                    throw new RuntimeException(menuitem);
                }
                return true;
            }

            static 
            {
                Object obj;
                String as[];
                byte byte1;
                int i;
                as = new String[2];
                obj = "s'6\013\036^o7G\bU;,\013\fUh.\002\024Eh*\023\037]h,\t9\\! \fZX)-\003\026U:c";
                byte1 = -1;
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
                    switch (byte1)
                    {
                    default:
                        as1[i] = ((String) (obj));
                        obj = "\020!-G\031\\)0\024Z";
                        i = 1;
                        byte1 = 0;
                        break;

                    case 0: // '\0'
                        as1[i] = ((String) (obj));
                        z = as;
                        PARAM_TYPES = (new Class[] {
                            com/actionbarsherlock/view/MenuItem
                        });
                        return;
                    }
                }
                if (true) goto _L2; else goto _L1
_L1:
                char c = obj[j];
                j % 5;
                JVM INSTR tableswitch 0 3: default 148
            //                           0 169
            //                           1 175
            //                           2 181
            //                           3 187;
                   goto _L3 _L4 _L5 _L6 _L7
_L7:
                break MISSING_BLOCK_LABEL_187;
_L3:
                byte byte0 = 122;
_L9:
                obj[j] = (char)(byte0 ^ c);
                j++;
                  goto _L8
_L4:
                byte0 = 48;
                  goto _L9
_L5:
                byte0 = 72;
                  goto _L9
_L6:
                byte0 = 67;
                  goto _L9
                byte0 = 103;
                  goto _L9
            }

            public InflatedOnMenuItemClickListener(Object obj, String s)
            {
                mRealOwner = obj;
                Class class1 = obj.getClass();
                try
                {
                    mMethod = class1.getMethod(s, PARAM_TYPES);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    s = new InflateException((new StringBuilder()).append(z[0]).append(s).append(z[1]).append(class1.getName()).toString());
                }
                s.initCause(((Throwable) (obj)));
                throw s;
            }
        }

    }

}
