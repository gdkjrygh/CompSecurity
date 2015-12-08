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
import android.support.v7.a.c;
import android.support.v7.a.h;
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
//            SearchView, r

final class q extends android.support.v4.widget.q
    implements android.view.View.OnClickListener
{

    private SearchManager j;
    private SearchView k;
    private SearchableInfo l;
    private Context m;
    private WeakHashMap n;
    private boolean o;
    private int p;
    private ColorStateList q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;

    public q(Context context, SearchView searchview, SearchableInfo searchableinfo, WeakHashMap weakhashmap)
    {
        super(context, h.r, null, true);
        o = false;
        p = 1;
        r = -1;
        s = -1;
        t = -1;
        u = -1;
        v = -1;
        w = -1;
        j = (SearchManager)d.getSystemService("search");
        k = searchview;
        l = searchableinfo;
        m = context;
        n = weakhashmap;
    }

    private Drawable a(ComponentName componentname)
    {
        Object obj = d.getPackageManager();
        ActivityInfo activityinfo;
        int i;
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
        i = activityinfo.getIconResource();
        if (i == 0)
        {
            return null;
        }
        obj = ((PackageManager) (obj)).getDrawable(componentname.getPackageName(), i, activityinfo.applicationInfo);
        if (obj == null)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder("Invalid icon resource ")).append(i).append(" for ").append(componentname.flattenToShortString()).toString());
            return null;
        } else
        {
            return ((Drawable) (obj));
        }
    }

    private Drawable a(Uri uri)
    {
        boolean flag = "android.resource".equals(uri.getScheme());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        Object obj = b(uri);
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        try
        {
            throw new FileNotFoundException((new StringBuilder("Resource does not exist: ")).append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.w("SuggestionsAdapter", (new StringBuilder("Icon not found: ")).append(uri).append(", ").append(((FileNotFoundException) (obj1)).getMessage()).toString());
        }
        return null;
        obj1 = m.getContentResolver().openInputStream(uri);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        throw new FileNotFoundException((new StringBuilder("Failed to open ")).append(uri).toString());
        Drawable drawable = Drawable.createFromStream(((InputStream) (obj1)), null);
        ((InputStream) (obj1)).close();
        return drawable;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder("Error closing icon stream for ")).append(uri).toString(), ((Throwable) (obj1)));
        return drawable;
        Exception exception;
        exception;
        ((InputStream) (obj1)).close();
_L1:
        throw exception;
        obj1;
        Log.e("SuggestionsAdapter", (new StringBuilder("Error closing icon stream for ")).append(uri).toString(), ((Throwable) (obj1)));
          goto _L1
    }

    private Drawable a(String s1)
    {
        if (s1 != null && s1.length() != 0 && !"0".equals(s1)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Drawable) (obj));
_L2:
        Drawable drawable1;
        String s2;
        int i;
        i = Integer.parseInt(s1);
        s2 = (new StringBuilder("android.resource://")).append(m.getPackageName()).append("/").append(i).toString();
        drawable1 = b(s2);
        obj = drawable1;
        if (drawable1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = m.getResources().getDrawable(i);
        a(s2, ((Drawable) (obj)));
        return ((Drawable) (obj));
        Object obj1;
        obj1;
        Drawable drawable2 = b(s1);
        obj1 = drawable2;
        if (drawable2 == null)
        {
            Drawable drawable = a(Uri.parse(s1));
            a(s1, drawable);
            return drawable;
        }
        continue; /* Loop/switch isn't completed */
        drawable;
        Log.w("SuggestionsAdapter", (new StringBuilder("Icon resource not found: ")).append(s1).toString());
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(Cursor cursor, int i)
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
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", cursor);
            return null;
        }
        return cursor;
    }

    public static String a(Cursor cursor, String s1)
    {
        return a(cursor, cursor.getColumnIndex(s1));
    }

    private static void a(ImageView imageview, Drawable drawable, int i)
    {
        imageview.setImageDrawable(drawable);
        if (drawable == null)
        {
            imageview.setVisibility(i);
            return;
        } else
        {
            imageview.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
            return;
        }
    }

    private static void a(TextView textview, CharSequence charsequence)
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

    private void a(String s1, Drawable drawable)
    {
        if (drawable != null)
        {
            n.put(s1, drawable.getConstantState());
        }
    }

    private Drawable b(Uri uri)
    {
        Object obj = uri.getAuthority();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            throw new FileNotFoundException((new StringBuilder("No authority: ")).append(uri).toString());
        }
        Resources resources;
        List list;
        try
        {
            resources = d.getPackageManager().getResourcesForApplication(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new FileNotFoundException((new StringBuilder("No package found for authority: ")).append(uri).toString());
        }
        list = uri.getPathSegments();
        if (list == null)
        {
            throw new FileNotFoundException((new StringBuilder("No path: ")).append(uri).toString());
        }
        int i = list.size();
        if (i == 1)
        {
            try
            {
                i = Integer.parseInt((String)list.get(0));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new FileNotFoundException((new StringBuilder("Single path segment is not a resource ID: ")).append(uri).toString());
            }
        } else
        if (i == 2)
        {
            i = resources.getIdentifier((String)list.get(1), (String)list.get(0), ((String) (obj)));
        } else
        {
            throw new FileNotFoundException((new StringBuilder("More than two path segments: ")).append(uri).toString());
        }
        if (i == 0)
        {
            throw new FileNotFoundException((new StringBuilder("No resource found for: ")).append(uri).toString());
        } else
        {
            return resources.getDrawable(i);
        }
    }

    private Drawable b(String s1)
    {
        s1 = (android.graphics.drawable.Drawable.ConstantState)n.get(s1);
        if (s1 == null)
        {
            return null;
        } else
        {
            return s1.newDrawable();
        }
    }

    private static void c(Cursor cursor)
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

    public final Cursor a(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            charsequence = "";
        } else
        {
            charsequence = charsequence.toString();
        }
        if (k.getVisibility() != 0 || k.getWindowVisibility() != 0)
        {
            return null;
        }
        SearchableInfo searchableinfo = l;
        if (searchableinfo != null) goto _L2; else goto _L1
_L1:
        charsequence = null;
_L3:
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        charsequence.getCount();
        return charsequence;
        charsequence;
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", charsequence);
        return null;
_L2:
        Object obj = searchableinfo.getSuggestAuthority();
label0:
        {
            if (obj != null)
            {
                break label0;
            }
            charsequence = null;
        }
          goto _L3
        String s1;
        obj = (new android.net.Uri.Builder()).scheme("content").authority(((String) (obj))).query("").fragment("");
        s1 = searchableinfo.getSuggestPath();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        ((android.net.Uri.Builder) (obj)).appendEncodedPath(s1);
        ((android.net.Uri.Builder) (obj)).appendPath("search_suggest_query");
        s1 = searchableinfo.getSuggestSelection();
        if (s1 == null) goto _L5; else goto _L4
_L4:
        String as[] = new String[1];
        as[0] = charsequence;
        charsequence = as;
_L6:
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("limit", "50");
        Uri uri = ((android.net.Uri.Builder) (obj)).build();
        charsequence = d.getContentResolver().query(uri, null, s1, charsequence, null);
          goto _L3
_L5:
        ((android.net.Uri.Builder) (obj)).appendPath(charsequence);
        charsequence = null;
          goto _L6
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = super.a(context, cursor, viewgroup);
        context.setTag(new r(context));
        return context;
    }

    public final void a(int i)
    {
        p = i;
    }

    public final void a(Cursor cursor)
    {
        if (!o) goto _L2; else goto _L1
_L1:
        Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return;
_L2:
        super.a(cursor);
        if (cursor != null)
        {
            try
            {
                r = cursor.getColumnIndex("suggest_text_1");
                s = cursor.getColumnIndex("suggest_text_2");
                t = cursor.getColumnIndex("suggest_text_2_url");
                u = cursor.getColumnIndex("suggest_icon_1");
                v = cursor.getColumnIndex("suggest_icon_2");
                w = cursor.getColumnIndex("suggest_flags");
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

    public final void a(View view, Cursor cursor)
    {
        Object obj1 = null;
        r r1 = (r)view.getTag();
        int i;
        if (w != -1)
        {
            i = cursor.getInt(w);
        } else
        {
            i = 0;
        }
        if (r1.a != null)
        {
            view = a(cursor, r);
            a(r1.a, ((CharSequence) (view)));
        }
        if (r1.b != null)
        {
            Object obj = a(cursor, t);
            ImageView imageview;
            if (obj != null)
            {
                if (q == null)
                {
                    view = new TypedValue();
                    d.getTheme().resolveAttribute(c.m, view, true);
                    q = d.getResources().getColorStateList(((TypedValue) (view)).resourceId);
                }
                view = new SpannableString(((CharSequence) (obj)));
                view.setSpan(new TextAppearanceSpan(null, 0, 0, q, null), 0, ((CharSequence) (obj)).length(), 33);
            } else
            {
                view = a(cursor, s);
            }
            if (TextUtils.isEmpty(view))
            {
                if (r1.a != null)
                {
                    r1.a.setSingleLine(false);
                    r1.a.setMaxLines(2);
                }
            } else
            if (r1.a != null)
            {
                r1.a.setSingleLine(true);
                r1.a.setMaxLines(1);
            }
            a(r1.b, ((CharSequence) (view)));
        }
        if (r1.c != null)
        {
            imageview = r1.c;
            if (u == -1)
            {
                view = null;
            } else
            {
                Drawable drawable = a(cursor.getString(u));
                view = drawable;
                if (drawable == null)
                {
                    view = l.getSearchActivity();
                    String s1 = view.flattenToShortString();
                    Drawable drawable1;
                    if (n.containsKey(s1))
                    {
                        view = (android.graphics.drawable.Drawable.ConstantState)n.get(s1);
                        if (view == null)
                        {
                            drawable1 = null;
                        } else
                        {
                            drawable1 = view.newDrawable(m.getResources());
                        }
                    } else
                    {
                        drawable1 = a(((ComponentName) (view)));
                        if (drawable1 == null)
                        {
                            view = null;
                        } else
                        {
                            view = drawable1.getConstantState();
                        }
                        n.put(s1, view);
                    }
                    view = drawable1;
                    if (drawable1 == null)
                    {
                        view = d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            a(imageview, ((Drawable) (view)), 4);
        }
        if (r1.d != null)
        {
            obj = r1.d;
            if (v == -1)
            {
                view = obj1;
            } else
            {
                view = a(cursor.getString(v));
            }
            a(((ImageView) (obj)), ((Drawable) (view)), 8);
        }
        if (p == 2 || p == 1 && (i & 1) != 0)
        {
            r1.e.setVisibility(0);
            r1.e.setTag(r1.a.getText());
            r1.e.setOnClickListener(this);
            return;
        } else
        {
            r1.e.setVisibility(8);
            return;
        }
    }

    public final CharSequence b(Cursor cursor)
    {
        if (cursor != null)
        {
            String s1 = a(cursor, "suggest_intent_query");
            if (s1 != null)
            {
                return s1;
            }
            if (l.shouldRewriteQueryFromData())
            {
                String s2 = a(cursor, "suggest_intent_data");
                if (s2 != null)
                {
                    return s2;
                }
            }
            if (l.shouldRewriteQueryFromText())
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

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        try
        {
            view = super.getView(i, view, viewgroup);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", view);
            viewgroup = a(d, c, viewgroup);
            if (viewgroup != null)
            {
                ((r)viewgroup.getTag()).a.setText(view.toString());
            }
            return viewgroup;
        }
        return view;
    }

    public final boolean hasStableIds()
    {
        return false;
    }

    public final void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        c(a());
    }

    public final void notifyDataSetInvalidated()
    {
        super.notifyDataSetInvalidated();
        c(a());
    }

    public final void onClick(View view)
    {
        view = ((View) (view.getTag()));
        if (view instanceof CharSequence)
        {
            k.a((CharSequence)view);
        }
    }
}
