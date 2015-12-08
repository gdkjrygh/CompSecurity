// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class Pathfinder
{
    public static interface Accumulator
    {

        public abstract void accumulate(View view);
    }

    private static class IntStack
    {

        private static final int MAX_INDEX_STACK_SIZE = 256;
        private final int mStack[] = new int[256];
        private int mStackSize;

        public int alloc()
        {
            int i = mStackSize;
            mStackSize = mStackSize + 1;
            mStack[i] = 0;
            return i;
        }

        public void free()
        {
            mStackSize = mStackSize - 1;
            if (mStackSize < 0)
            {
                throw new ArrayIndexOutOfBoundsException(mStackSize);
            } else
            {
                return;
            }
        }

        public boolean full()
        {
            return mStack.length == mStackSize;
        }

        public void increment(int i)
        {
            int ai[] = mStack;
            ai[i] = ai[i] + 1;
        }

        public int read(int i)
        {
            return mStack[i];
        }

        public IntStack()
        {
            mStackSize = 0;
        }
    }

    public static class PathElement
    {

        public static final int SHORTEST_PREFIX = 1;
        public static final int ZERO_LENGTH_PREFIX = 0;
        public final String contentDescription;
        public final int index;
        public final int prefix;
        public final String tag;
        public final String viewClassName;
        public final int viewId;

        public String toString()
        {
            Object obj;
            try
            {
                obj = new JSONObject();
                if (prefix == 1)
                {
                    ((JSONObject) (obj)).put("prefix", "shortest");
                }
                if (viewClassName != null)
                {
                    ((JSONObject) (obj)).put("view_class", viewClassName);
                }
                if (index > -1)
                {
                    ((JSONObject) (obj)).put("index", index);
                }
                if (viewId > -1)
                {
                    ((JSONObject) (obj)).put("id", viewId);
                }
                if (contentDescription != null)
                {
                    ((JSONObject) (obj)).put("contentDescription", contentDescription);
                }
                if (tag != null)
                {
                    ((JSONObject) (obj)).put("tag", tag);
                }
                obj = ((JSONObject) (obj)).toString();
            }
            catch (JSONException jsonexception)
            {
                throw new RuntimeException("Can't serialize PathElement to String", jsonexception);
            }
            return ((String) (obj));
        }

        public PathElement(int i, String s, int j, int k, String s1, String s2)
        {
            prefix = i;
            viewClassName = s;
            index = j;
            viewId = k;
            contentDescription = s1;
            tag = s2;
        }
    }


    private static final String LOGTAG = "MixpanelAPI.PathFinder";
    private final IntStack mIndexStack = new IntStack();

    public Pathfinder()
    {
    }

    private View findPrefixedMatch(PathElement pathelement, View view, int i)
    {
        int j = mIndexStack.read(i);
        if (matches(pathelement, view))
        {
            mIndexStack.increment(i);
            if (pathelement.index == -1 || pathelement.index == j)
            {
                return view;
            }
        }
        if (pathelement.prefix != 1 || !(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        view = (ViewGroup)view;
        l = view.getChildCount();
        k = 0;
_L5:
        if (k < l) goto _L3; else goto _L2
_L2:
        return null;
_L3:
        View view1 = findPrefixedMatch(pathelement, view.getChildAt(k), i);
        if (view1 != null)
        {
            return view1;
        }
        k++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void findTargetsInMatchedView(View view, List list, Accumulator accumulator)
    {
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        accumulator.accumulate(view);
_L4:
        return;
_L2:
        if (!(view instanceof ViewGroup)) goto _L4; else goto _L3
_L3:
        PathElement pathelement;
        int i;
        int j;
        int k;
        if (mIndexStack.full())
        {
            Log.v("MixpanelAPI.PathFinder", "Path is too deep, will not match");
            return;
        }
        view = (ViewGroup)view;
        pathelement = (PathElement)list.get(0);
        list = list.subList(1, list.size());
        j = view.getChildCount();
        k = mIndexStack.alloc();
        i = 0;
_L9:
        if (i < j) goto _L6; else goto _L5
_L5:
        mIndexStack.free();
        return;
_L6:
        View view1 = findPrefixedMatch(pathelement, view.getChildAt(i), k);
        if (view1 != null)
        {
            findTargetsInMatchedView(view1, list, accumulator);
        }
        if (pathelement.index >= 0 && mIndexStack.read(k) > pathelement.index) goto _L5; else goto _L7
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static boolean hasClassName(Object obj, String s)
    {
        obj = obj.getClass();
        do
        {
            if (((Class) (obj)).getCanonicalName().equals(s))
            {
                return true;
            }
            if (obj == java/lang/Object)
            {
                return false;
            }
            obj = ((Class) (obj)).getSuperclass();
        } while (true);
    }

    private boolean matches(PathElement pathelement, View view)
    {
        if ((pathelement.viewClassName == null || hasClassName(view, pathelement.viewClassName)) && (-1 == pathelement.viewId || view.getId() == pathelement.viewId) && (pathelement.contentDescription == null || pathelement.contentDescription.equals(view.getContentDescription())))
        {
            String s = pathelement.tag;
            if (pathelement.tag == null || view.getTag() != null && s.equals(view.getTag().toString()))
            {
                return true;
            }
        }
        return false;
    }

    public void findTargetsInRoot(View view, List list, Accumulator accumulator)
    {
        if (!list.isEmpty())
        {
            if (mIndexStack.full())
            {
                Log.w("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
                return;
            }
            PathElement pathelement = (PathElement)list.get(0);
            list = list.subList(1, list.size());
            view = findPrefixedMatch(pathelement, view, mIndexStack.alloc());
            mIndexStack.free();
            if (view != null)
            {
                findTargetsInMatchedView(view, list, accumulator);
                return;
            }
        }
    }
}
