// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.widget;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

// Referenced classes of package com.actionbarsherlock.widget:
//            SearchView

class SuggestionsAdapter extends ResourceCursorAdapter
    implements android.view.View.OnClickListener
{

    private static final String z[];
    private boolean mClosed;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private WeakHashMap mOutsideDrawablesCache;
    private Context mProviderContext;
    private int mQueryRefinement;
    private SearchView mSearchView;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    private Drawable checkIconCache(String s)
    {
        s = (android.graphics.drawable.Drawable.ConstantState)mOutsideDrawablesCache.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.newDrawable();
        }
    }

    private CharSequence formatUrl(CharSequence charsequence)
    {
        if (mUrlColor == null)
        {
            TypedValue typedvalue = new TypedValue();
            mContext.getTheme().resolveAttribute(com.actionbarsherlock.R.attr.textColorSearchUrl, typedvalue, true);
            mUrlColor = mContext.getResources().getColorStateList(typedvalue.resourceId);
        }
        SpannableString spannablestring = new SpannableString(charsequence);
        spannablestring.setSpan(new TextAppearanceSpan(null, 0, 0, mUrlColor, null), 0, charsequence.length(), 33);
        return spannablestring;
    }

    public static String getColumnString(Cursor cursor, String s)
    {
        return getStringOrNull(cursor, cursor.getColumnIndex(s));
    }

    private Drawable getDefaultIcon1(Cursor cursor)
    {
        return mContext.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable getDrawable(Uri uri)
    {
        boolean flag;
        String s = uri.getScheme();
        flag = z[29].equals(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        Object obj = getTheDrawable(uri);
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        try
        {
            throw new FileNotFoundException((new StringBuilder()).append(z[34]).append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.w(z[33], (new StringBuilder()).append(z[28]).append(uri).append(z[30]).append(((FileNotFoundException) (obj1)).getMessage()).toString());
        }
        return null;
        obj1 = mProviderContext.getContentResolver().openInputStream(uri);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        throw new FileNotFoundException((new StringBuilder()).append(z[26]).append(uri).toString());
        obj1;
        throw obj1;
        Drawable drawable = Drawable.createFromStream(((InputStream) (obj1)), null);
        ((InputStream) (obj1)).close();
        return drawable;
        obj1;
        Log.e(z[32], (new StringBuilder()).append(z[31]).append(uri).toString(), ((Throwable) (obj1)));
        return drawable;
        Exception exception;
        exception;
        ((InputStream) (obj1)).close();
_L1:
        throw exception;
        obj1;
        Log.e(z[25], (new StringBuilder()).append(z[27]).append(uri).toString(), ((Throwable) (obj1)));
          goto _L1
    }

    private Drawable getDrawableFromResourceValue(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        int i;
        try
        {
            i = s.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        Object obj;
        if ("0".equals(s))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        Drawable drawable;
        String s1;
        int j;
        try
        {
            j = Integer.parseInt(s);
            s1 = (new StringBuilder()).append(z[0]).append(mProviderContext.getPackageName()).append("/").append(j).toString();
            drawable = checkIconCache(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Drawable drawable1 = checkIconCache(s);
            obj = drawable1;
            if (drawable1 == null)
            {
                obj = getDrawable(Uri.parse(s));
                storeInIconCache(s, ((Drawable) (obj)));
                return ((Drawable) (obj));
            }
            break MISSING_BLOCK_LABEL_185;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(z[1], (new StringBuilder()).append(z[2]).append(s).toString());
            return null;
        }
        obj = drawable;
        if (drawable != null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        obj = mProviderContext.getResources().getDrawable(j);
        storeInIconCache(s1, ((Drawable) (obj)));
        return ((Drawable) (obj));
        obj = null;
        return ((Drawable) (obj));
    }

    private Drawable getIcon1(Cursor cursor)
    {
        Drawable drawable;
        int i;
        try
        {
            i = mIconName1Col;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        if (i == -1)
        {
            drawable = null;
        } else
        {
            Drawable drawable1 = getDrawableFromResourceValue(cursor.getString(mIconName1Col));
            drawable = drawable1;
            if (drawable1 == null)
            {
                return getDefaultIcon1(cursor);
            }
        }
        return drawable;
    }

    private Drawable getIcon2(Cursor cursor)
    {
        int i;
        try
        {
            i = mIconName2Col;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw cursor;
        }
        if (i == -1)
        {
            return null;
        } else
        {
            return getDrawableFromResourceValue(cursor.getString(mIconName2Col));
        }
    }

    private static String getStringOrNull(Cursor cursor, int i)
    {
        if (i == -1)
        {
            return null;
        }
        try
        {
            cursor = cursor.getString(i);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e(z[11], z[12], cursor);
            return null;
        }
        return cursor;
    }

    private void setViewDrawable(ImageView imageview, Drawable drawable, int i)
    {
        try
        {
            imageview.setImageDrawable(drawable);
        }
        // Misplaced declaration of an exception variable
        catch (ImageView imageview)
        {
            try
            {
                throw imageview;
            }
            // Misplaced declaration of an exception variable
            catch (ImageView imageview)
            {
                throw imageview;
            }
        }
        if (drawable != null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        imageview.setVisibility(i);
        if (!SearchView.a)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        imageview.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
        return;
    }

    private void setViewText(TextView textview, CharSequence charsequence)
    {
        boolean flag;
        try
        {
            textview.setText(charsequence);
            flag = TextUtils.isEmpty(charsequence);
        }
        // Misplaced declaration of an exception variable
        catch (TextView textview)
        {
            try
            {
                throw textview;
            }
            // Misplaced declaration of an exception variable
            catch (TextView textview)
            {
                throw textview;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        textview.setVisibility(8);
        if (!SearchView.a)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        textview.setVisibility(0);
        return;
    }

    private void storeInIconCache(String s, Drawable drawable)
    {
        if (drawable == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        mOutsideDrawablesCache.put(s, drawable.getConstantState());
        return;
        s;
        throw s;
    }

    private void updateSpinnerState(Cursor cursor)
    {
        if (cursor != null)
        {
            try
            {
                cursor = cursor.getExtras();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                throw cursor;
            }
        } else
        {
            cursor = null;
        }
        if (cursor != null)
        {
            boolean flag;
            try
            {
                flag = cursor.getBoolean(z[38]);
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                throw cursor;
            }
            if (!flag);
        }
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        int i = 0;
        boolean flag = SearchView.a;
        context = (ChildViewCache)view.getTag();
        if (mFlagsCol != -1)
        {
            i = cursor.getInt(mFlagsCol);
        }
        if (((ChildViewCache) (context)).mText1 != null)
        {
            view = getStringOrNull(cursor, mText1Col);
            setViewText(((ChildViewCache) (context)).mText1, view);
        }
        if (((ChildViewCache) (context)).mText2 == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        view = getStringOrNull(cursor, mText2UrlCol);
        TextView textview;
        int j;
        boolean flag1;
        if (view != null)
        {
            view = formatUrl(view);
        } else
        {
            view = getStringOrNull(cursor, mText2Col);
        }
        flag1 = TextUtils.isEmpty(view);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        textview = ((ChildViewCache) (context)).mText1;
        if (textview == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        ((ChildViewCache) (context)).mText1.setSingleLine(false);
        ((ChildViewCache) (context)).mText1.setMaxLines(2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        try
        {
            if (((ChildViewCache) (context)).mText1 != null)
            {
                ((ChildViewCache) (context)).mText1.setSingleLine(true);
                ((ChildViewCache) (context)).mText1.setMaxLines(1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        setViewText(((ChildViewCache) (context)).mText2, view);
        try
        {
            if (((ChildViewCache) (context)).mIcon1 != null)
            {
                setViewDrawable(((ChildViewCache) (context)).mIcon1, getIcon1(cursor), 4);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        try
        {
            if (((ChildViewCache) (context)).mIcon2 != null)
            {
                setViewDrawable(((ChildViewCache) (context)).mIcon2, getIcon2(cursor), 8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        j = mQueryRefinement;
        if (j == 2)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        j = mQueryRefinement;
        if (j != 1 || (i & 1) == 0)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        try
        {
            ((ChildViewCache) (context)).mIconRefine.setVisibility(0);
            ((ChildViewCache) (context)).mIconRefine.setTag(((ChildViewCache) (context)).mText1.getText());
            ((ChildViewCache) (context)).mIconRefine.setOnClickListener(this);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        ((ChildViewCache) (context)).mIconRefine.setVisibility(8);
        return;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
        view;
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        try
        {
            throw view;
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        throw view;
    }

    public void changeCursor(Cursor cursor)
    {
        if (!mClosed)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        Log.w(z[24], z[19]);
        if (cursor != null)
        {
            try
            {
                cursor.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                throw cursor;
            }
        }
        break MISSING_BLOCK_LABEL_164;
        cursor;
        throw cursor;
        super.changeCursor(cursor);
        if (cursor != null)
        {
            try
            {
                mText1Col = cursor.getColumnIndex(z[22]);
                mText2Col = cursor.getColumnIndex(z[20]);
                mText2UrlCol = cursor.getColumnIndex(z[23]);
                mIconName1Col = cursor.getColumnIndex(z[21]);
                mIconName2Col = cursor.getColumnIndex(z[17]);
                mFlagsCol = cursor.getColumnIndex(z[18]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Log.e(z[16], z[15], cursor);
            }
        }
    }

    public CharSequence convertToString(Cursor cursor)
    {
        if (cursor != null)
        {
            if ((cursor = getColumnString(cursor, z[39])) != null)
            {
                return cursor;
            }
        }
        return null;
    }

    public Cursor getSuggestions(String s, int i)
    {
        android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme(z[35]).query("").fragment("");
        try
        {
            builder.appendPath(z[36]);
            builder.appendPath(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        builder.appendQueryParameter(z[37], String.valueOf(i));
        s = builder.build();
        return mContext.getContentResolver().query(s, null, null, null, null);
    }

    public Drawable getTheDrawable(Uri uri)
    {
        Object obj;
        Resources resources;
        List list;
        int i;
        obj = uri.getAuthority();
        try
        {
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                throw new FileNotFoundException((new StringBuilder()).append(z[6]).append(uri).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        try
        {
            resources = mContext.getPackageManager().getResourcesForApplication(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new FileNotFoundException((new StringBuilder()).append(z[8]).append(uri).toString());
        }
        list = uri.getPathSegments();
        if (list == null)
        {
            try
            {
                throw new FileNotFoundException((new StringBuilder()).append(z[7]).append(uri).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        i = list.size();
        if (i != 1) goto _L2; else goto _L1
_L1:
        try
        {
            i = Integer.parseInt((String)list.get(0));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new FileNotFoundException((new StringBuilder()).append(z[3]).append(uri).toString());
        }
_L4:
        if (i == 0)
        {
            try
            {
                throw new FileNotFoundException((new StringBuilder()).append(z[5]).append(uri).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        } else
        {
            return resources.getDrawable(i);
        }
_L2:
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
        if (!SearchView.a) goto _L4; else goto _L3
_L3:
        throw new FileNotFoundException((new StringBuilder()).append(z[4]).append(uri).toString());
        uri;
        throw uri;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i, view, viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.w(z[13], z[14], view);
            viewgroup = newView(mContext, mCursor, viewgroup);
            if (viewgroup != null)
            {
                ((ChildViewCache)viewgroup.getTag()).mText1.setText(view.toString());
            }
            return viewgroup;
        }
        return view;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = super.newView(context, cursor, viewgroup);
        context.setTag(new ChildViewCache(context));
        return context;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    public void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    public void onClick(View view)
    {
        view = ((View) (view.getTag()));
        try
        {
            if (view instanceof CharSequence)
            {
                mSearchView.onQueryRefine((CharSequence)view);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw view;
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
label0:
        {
            int i;
            if (charsequence == null)
            {
                charsequence = "";
            } else
            {
                charsequence = charsequence.toString();
            }
            try
            {
                if (mSearchView.getVisibility() != 0)
                {
                    break label0;
                }
                i = mSearchView.getWindowVisibility();
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                try
                {
                    throw charsequence;
                }
                // Misplaced declaration of an exception variable
                catch (CharSequence charsequence)
                {
                    throw charsequence;
                }
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_48;
            }
        }
        return null;
        charsequence = getSuggestions(charsequence, 50);
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        charsequence.getCount();
        return charsequence;
        charsequence;
        Log.w(z[9], z[10], charsequence);
        return null;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[40];
        obj = "\0043PY\177\f9\032Yu\0262AYs\000g\033\004";
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
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",>[E0\0278GDe\027>Q\013~\n)\024M\177\0203P\0210";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "64ZL|\000}DJd\r}GNw\b8Z_0\f.\024E\177\021}U\013b\000.[^b\0068\024bT_}";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "(2FN0\0215UE0\021*[\013`\004)\\\013c\000:YN~\021.\016\013";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "+2\024Yu\0262AYs\000}RDe\0139\024M\177\027g\024";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "+2\024Je\0215[Yy\021$\016\013";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "+2\024[q\0215\016\013";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "+2\024[q\0066ULuE;[^~\001}RDbE<A_x\n/]_i_}";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "68UYs\r}G^w\0028G_y\n3G\013a\0208FR0\0215FNgE<Z\013u\035>Q[d\f2Z\005";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\0203QS`\000>@NtE8FY\177\027}FNd\0274Q]y\013:\024]q\t4P\013s\n1AF~E;FD}E>AYc\n/\030\013t\f9\024_x\000}FN}\n)Q\013`\0272WNc\026}PBuZ";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "68UYs\r}G^w\0028G_y\n3G\013s\020/GDbE)\\Yu\022}QSs\000-@B\177\013s";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\000/FDbE>\\J~\0024ZL0\006(FX\177\027}UEtE>UHx\f3S\013s\n1AF~\026";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 15;
                i = 16;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\026(SLu\026)kBs\n3k\031";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\026(SLu\026)kM|\004:G";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "1/]NtE)[\013s\r<ZLuE>AYc\n/\024Jv\0218F\013q\001<D_u\027}CJcE>XDc\0009\032";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\026(SLu\026)k_u\035)k\031";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\026(SLu\026)kBs\n3k\032";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\026(SLu\026)k_u\035)k\032";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\026(SLu\026)k_u\035)k\031O\020/X";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "#<]Gu\001}@D0\n-QE0";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = " /FDbE>XDc\f3S\013y\0062Z\013c\021/QJ}E;[Y0";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = ",>[E0\0132@\013v\n(ZO*E";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\0043PY\177\f9\032Yu\0262AYs\0";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "I}";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = " /FDbE>XDc\f3S\013y\0062Z\013c\021/QJ}E;[Y0";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "6(SLu\026)]D~\026\034PJ`\0218F";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "78GDe\027>Q\013t\n8G\013~\n)\024Nh\f.@\0210";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\0062Z_u\013)";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "\0268UYs\r\002G^w\0028G_O\024(QYi";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "\t4YBd";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "\f3k[b\n:FNc\026";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "\026(SLu\026)kB~\0218Z_O\024(QYi";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 960
    //                   0 983
    //                   1 990
    //                   2 997
    //                   3 1004;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1004;
_L3:
        byte byte1 = 16;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 101;
          goto _L9
_L5:
        byte1 = 93;
          goto _L9
_L6:
        byte1 = 52;
          goto _L9
        byte1 = 43;
          goto _L9
    }

    private class ChildViewCache
    {

        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view)
        {
            mText1 = (TextView)view.findViewById(0x1020014);
            mText2 = (TextView)view.findViewById(0x1020015);
            mIcon1 = (ImageView)view.findViewById(0x1020007);
            mIcon2 = (ImageView)view.findViewById(0x1020008);
            mIconRefine = (ImageView)view.findViewById(com.actionbarsherlock.R.id.edit_query);
        }
    }

}
