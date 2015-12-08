// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ResourceCursorAdapter;
import android.support.v7.a.b;
import android.support.v7.a.g;
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

// Referenced classes of package android.support.v7.widget:
//            SearchView, bf

class be extends ResourceCursorAdapter
    implements android.view.View.OnClickListener
{

    private final SearchManager a;
    private final SearchView b;
    private final SearchableInfo c;
    private final Context d;
    private final WeakHashMap e;
    private final int f;
    private boolean g;
    private int h;
    private ColorStateList i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    public be(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
        super(context, searchview.getSuggestionRowLayout(), null, true);
        g = false;
        h = 1;
        j = -1;
        k = -1;
        l = -1;
        m = -1;
        n = -1;
        o = -1;
        a = (SearchManager)mContext.getSystemService("search");
        b = searchview;
        c = searchableinfo;
        f = searchview.getSuggestionCommitIconResId();
        d = context;
        e = weakhashmap;
    }

    private Drawable a(ComponentName componentname)
    {
        Object obj = null;
        String s = componentname.flattenToShortString();
        if (e.containsKey(s))
        {
            componentname = (android.graphics.drawable.Drawable.ConstantState)e.get(s);
            if (componentname == null)
            {
                return null;
            } else
            {
                return componentname.newDrawable(d.getResources());
            }
        }
        Drawable drawable = b(componentname);
        if (drawable == null)
        {
            componentname = obj;
        } else
        {
            componentname = drawable.getConstantState();
        }
        e.put(s, componentname);
        return drawable;
    }

    private Drawable a(String s)
    {
        if (s != null && s.length() != 0 && !"0".equals(s)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Drawable) (obj));
_L2:
        Drawable drawable1;
        String s1;
        int i1;
        i1 = Integer.parseInt(s);
        s1 = (new StringBuilder()).append("android.resource://").append(d.getPackageName()).append("/").append(i1).toString();
        drawable1 = b(s1);
        obj = drawable1;
        if (drawable1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ContextCompat.getDrawable(d, i1);
        a(s1, ((Drawable) (obj)));
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        Drawable drawable2 = b(s);
        obj1 = drawable2;
        if (drawable2 == null)
        {
            Drawable drawable = b(Uri.parse(s));
            a(s, drawable);
            return drawable;
        }
        continue; /* Loop/switch isn't completed */
        drawable;
        Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon resource not found: ").append(s).toString());
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private CharSequence a(CharSequence charsequence)
    {
        if (i == null)
        {
            TypedValue typedvalue = new TypedValue();
            mContext.getTheme().resolveAttribute(b.textColorSearchUrl, typedvalue, true);
            i = mContext.getResources().getColorStateList(typedvalue.resourceId);
        }
        SpannableString spannablestring = new SpannableString(charsequence);
        spannablestring.setSpan(new TextAppearanceSpan(null, 0, 0, i, null), 0, charsequence.length(), 33);
        return spannablestring;
    }

    private static String a(Cursor cursor, int i1)
    {
        if (i1 == -1)
        {
            return null;
        }
        try
        {
            cursor = cursor.getString(i1);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", cursor);
            return null;
        }
        return cursor;
    }

    public static String a(Cursor cursor, String s)
    {
        return a(cursor, cursor.getColumnIndex(s));
    }

    private void a(Cursor cursor)
    {
        if (cursor != null)
        {
            cursor = cursor.getExtras();
        } else
        {
            cursor = null;
        }
        if (cursor != null)
        {
            if (!cursor.getBoolean("in_progress"));
        }
    }

    private void a(ImageView imageview, Drawable drawable, int i1)
    {
        imageview.setImageDrawable(drawable);
        if (drawable == null)
        {
            imageview.setVisibility(i1);
            return;
        } else
        {
            imageview.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
            return;
        }
    }

    private void a(TextView textview, CharSequence charsequence)
    {
        textview.setText(charsequence);
        if (TextUtils.isEmpty(charsequence))
        {
            textview.setVisibility(8);
            return;
        } else
        {
            textview.setVisibility(0);
            return;
        }
    }

    private void a(String s, Drawable drawable)
    {
        if (drawable != null)
        {
            e.put(s, drawable.getConstantState());
        }
    }

    private Drawable b(ComponentName componentname)
    {
        Object obj = mContext.getPackageManager();
        ActivityInfo activityinfo;
        int i1;
        try
        {
            activityinfo = ((PackageManager) (obj)).getActivityInfo(componentname, 128);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.w("SuggestionsAdapter", componentname.toString());
            return null;
        }
        i1 = activityinfo.getIconResource();
        if (i1 == 0)
        {
            return null;
        }
        obj = ((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i1, activityinfo.applicationInfo);
        if (obj == null)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder()).append("Invalid icon resource ").append(i1).append(" for ").append(componentname.flattenToShortString()).toString());
            return null;
        } else
        {
            return ((Drawable) (obj));
        }
    }

    private Drawable b(Cursor cursor)
    {
        Drawable drawable;
        if (m == -1)
        {
            drawable = null;
        } else
        {
            Drawable drawable1 = a(cursor.getString(m));
            drawable = drawable1;
            if (drawable1 == null)
            {
                return d(cursor);
            }
        }
        return drawable;
    }

    private Drawable b(Uri uri)
    {
        boolean flag = "android.resource".equals(uri.getScheme());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = a(uri);
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        try
        {
            throw new FileNotFoundException((new StringBuilder()).append("Resource does not exist: ").append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder()).append("Icon not found: ").append(uri).append(", ").append(((FileNotFoundException) (obj1)).getMessage()).toString());
        }
        return null;
        obj1 = d.getContentResolver().openInputStream(uri);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        throw new FileNotFoundException((new StringBuilder()).append("Failed to open ").append(uri).toString());
        Drawable drawable = Drawable.createFromStream(((InputStream) (obj1)), null);
        ((InputStream) (obj1)).close();
        return drawable;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(uri).toString(), ((Throwable) (obj1)));
        return drawable;
        Exception exception;
        exception;
        ((InputStream) (obj1)).close();
_L1:
        throw exception;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder()).append("Error closing icon stream for ").append(uri).toString(), ((Throwable) (obj1)));
          goto _L1
    }

    private Drawable b(String s)
    {
        s = (android.graphics.drawable.Drawable.ConstantState)e.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.newDrawable();
        }
    }

    private Drawable c(Cursor cursor)
    {
        if (n == -1)
        {
            return null;
        } else
        {
            return a(cursor.getString(n));
        }
    }

    private Drawable d(Cursor cursor)
    {
        cursor = a(c.getSearchActivity());
        if (cursor != null)
        {
            return cursor;
        } else
        {
            return mContext.getPackageManager().getDefaultActivityIcon();
        }
    }

    Cursor a(SearchableInfo searchableinfo, String s, int i1)
    {
        Object obj;
        if (searchableinfo != null)
        {
            if ((obj = searchableinfo.getSuggestAuthority()) != null)
            {
                obj = (new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("");
                String s1 = searchableinfo.getSuggestPath();
                if (s1 != null)
                {
                    ((android.net.Uri.Builder) (obj)).appendEncodedPath(s1);
                }
                ((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
                s1 = searchableinfo.getSuggestSelection();
                if (s1 != null)
                {
                    searchableinfo = new String[1];
                    searchableinfo[0] = s;
                } else
                {
                    ((android.net.Uri.Builder) (obj)).appendPath(s);
                    searchableinfo = null;
                }
                if (i1 > 0)
                {
                    ((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", String.valueOf(i1));
                }
                s = ((android.net.Uri.Builder) (obj)).build();
                return mContext.getContentResolver().query(s, null, s1, searchableinfo, null);
            }
        }
        return null;
    }

    Drawable a(Uri uri)
    {
        Object obj = uri.getAuthority();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new FileNotFoundException((new StringBuilder()).append("No authority: ").append(uri).toString());
        }
        Resources resources;
        List list;
        try
        {
            resources = mContext.getPackageManager().getResourcesForApplication(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No package found for authority: ").append(uri).toString());
        }
        list = uri.getPathSegments();
        if (list == null)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No path: ").append(uri).toString());
        }
        int i1 = list.size();
        if (i1 == 1)
        {
            try
            {
                i1 = Integer.parseInt((String)list.get(0));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new FileNotFoundException((new StringBuilder()).append("Single path segment is not a resource ID: ").append(uri).toString());
            }
        } else
        if (i1 == 2)
        {
            i1 = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
        } else
        {
            throw new FileNotFoundException((new StringBuilder()).append("More than two path segments: ").append(uri).toString());
        }
        if (i1 == 0)
        {
            throw new FileNotFoundException((new StringBuilder()).append("No resource found for: ").append(uri).toString());
        } else
        {
            return resources.getDrawable(i1);
        }
    }

    public void a(int i1)
    {
        h = i1;
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        context = (bf)view.getTag();
        int i1;
        if (o != -1)
        {
            i1 = cursor.getInt(o);
        } else
        {
            i1 = 0;
        }
        if (((bf) (context)).a != null)
        {
            view = a(cursor, j);
            a(((bf) (context)).a, view);
        }
        if (((bf) (context)).b == null) goto _L2; else goto _L1
_L1:
        view = a(cursor, l);
        if (view != null)
        {
            view = a(view);
        } else
        {
            view = a(cursor, k);
        }
        if (!TextUtils.isEmpty(view)) goto _L4; else goto _L3
_L3:
        if (((bf) (context)).a != null)
        {
            ((bf) (context)).a.setSingleLine(false);
            ((bf) (context)).a.setMaxLines(2);
        }
_L6:
        a(((bf) (context)).b, view);
_L2:
        if (((bf) (context)).c != null)
        {
            a(((bf) (context)).c, b(cursor), 4);
        }
        if (((bf) (context)).d != null)
        {
            a(((bf) (context)).d, c(cursor), 8);
        }
        if (h == 2 || h == 1 && (i1 & 1) != 0)
        {
            ((bf) (context)).e.setVisibility(0);
            ((bf) (context)).e.setTag(((bf) (context)).a.getText());
            ((bf) (context)).e.setOnClickListener(this);
            return;
        } else
        {
            ((bf) (context)).e.setVisibility(8);
            return;
        }
_L4:
        if (((bf) (context)).a != null)
        {
            ((bf) (context)).a.setSingleLine(true);
            ((bf) (context)).a.setMaxLines(1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void changeCursor(Cursor cursor)
    {
        if (!g) goto _L2; else goto _L1
_L1:
        Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return;
_L2:
        super.changeCursor(cursor);
        if (cursor != null)
        {
            try
            {
                j = cursor.getColumnIndex("suggest_text_1");
                k = cursor.getColumnIndex("suggest_text_2");
                l = cursor.getColumnIndex("suggest_text_2_url");
                m = cursor.getColumnIndex("suggest_icon_1");
                n = cursor.getColumnIndex("suggest_icon_2");
                o = cursor.getColumnIndex("suggest_flags");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                Log.e("SuggestionsAdapter", "error changing cursor and caching columns", cursor);
            }
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public CharSequence convertToString(Cursor cursor)
    {
        if (cursor != null)
        {
            String s = a(cursor, "suggest_intent_query");
            if (s != null)
            {
                return s;
            }
            if (c.shouldRewriteQueryFromData())
            {
                String s1 = a(cursor, "suggest_intent_data");
                if (s1 != null)
                {
                    return s1;
                }
            }
            if (c.shouldRewriteQueryFromText())
            {
                cursor = a(cursor, "suggest_text_1");
                if (cursor != null)
                {
                    return cursor;
                }
            }
        }
        return null;
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i1, view, viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", view);
            viewgroup = newView(mContext, mCursor, viewgroup);
            if (viewgroup != null)
            {
                ((bf)viewgroup.getTag()).a.setText(view.toString());
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
        context.setTag(new bf(context));
        ((ImageView)context.findViewById(g.edit_query)).setImageResource(f);
        return context;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        a(getCursor());
    }

    public void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        a(getCursor());
    }

    public void onClick(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof CharSequence)
        {
            b.a((CharSequence)view);
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            charsequence = "";
        } else
        {
            charsequence = charsequence.toString();
        }
        if (b.getVisibility() != 0 || b.getWindowVisibility() != 0)
        {
            return null;
        }
        charsequence = a(c, charsequence, 50);
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        charsequence.getCount();
        return charsequence;
        charsequence;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", charsequence);
        return null;
    }
}
