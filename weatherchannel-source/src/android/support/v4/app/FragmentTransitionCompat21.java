// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class FragmentTransitionCompat21
{
    public static class EpicenterView
    {

        public View epicenter;

        public EpicenterView()
        {
        }
    }

    public static interface ViewRetriever
    {

        public abstract View getView();
    }


    FragmentTransitionCompat21()
    {
    }

    public static void addTargets(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        if (obj instanceof TransitionSet)
        {
            obj = (TransitionSet)obj;
            int k = ((TransitionSet) (obj)).getTransitionCount();
            for (int i = 0; i < k; i++)
            {
                addTargets(((TransitionSet) (obj)).getTransitionAt(i), arraylist);
            }

        } else
        if (!hasSimpleTarget(((Transition) (obj))) && isNullOrEmpty(((Transition) (obj)).getTargets()))
        {
            int l = arraylist.size();
            for (int j = 0; j < l; j++)
            {
                ((Transition) (obj)).addTarget((View)arraylist.get(j));
            }

        }
    }

    public static void addTransitionTargets(Object obj, Object obj1, View view, ViewRetriever viewretriever, View view1, EpicenterView epicenterview, Map map, ArrayList arraylist, 
            Map map1, ArrayList arraylist1)
    {
        if (obj != null || obj1 != null)
        {
            obj = (Transition)obj;
            if (obj != null)
            {
                ((Transition) (obj)).addTarget(view1);
            }
            if (obj1 != null)
            {
                addTargets((Transition)obj1, arraylist1);
            }
            if (viewretriever != null)
            {
                view.getViewTreeObserver().addOnPreDrawListener(new _cls2(view, viewretriever, map, map1, ((Transition) (obj)), arraylist, view1));
            }
            setSharedElementEpicenter(((Transition) (obj)), epicenterview);
        }
    }

    public static void beginDelayedTransition(ViewGroup viewgroup, Object obj)
    {
        TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj);
    }

    public static Object captureExitingViews(Object obj, View view, ArrayList arraylist, Map map, View view1)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                captureTransitioningViews(arraylist, view);
                if (map != null)
                {
                    arraylist.removeAll(map.values());
                }
                if (!arraylist.isEmpty())
                {
                    break label0;
                }
                obj1 = null;
            }
            return obj1;
        }
        arraylist.add(view1);
        addTargets((Transition)obj, arraylist);
        return obj;
    }

    private static void captureTransitioningViews(ArrayList arraylist, View view)
    {
label0:
        {
            if (view.getVisibility() == 0)
            {
                if (!(view instanceof ViewGroup))
                {
                    break label0;
                }
                view = (ViewGroup)view;
                if (view.isTransitionGroup())
                {
                    arraylist.add(view);
                } else
                {
                    int j = view.getChildCount();
                    int i = 0;
                    while (i < j) 
                    {
                        captureTransitioningViews(arraylist, view.getChildAt(i));
                        i++;
                    }
                }
            }
            return;
        }
        arraylist.add(view);
    }

    public static void cleanupTransitions(View view, View view1, Object obj, ArrayList arraylist, Object obj1, ArrayList arraylist1, Object obj2, ArrayList arraylist2, 
            Object obj3, ArrayList arraylist3, Map map)
    {
        obj = (Transition)obj;
        obj1 = (Transition)obj1;
        obj2 = (Transition)obj2;
        obj3 = (Transition)obj3;
        if (obj3 != null)
        {
            view.getViewTreeObserver().addOnPreDrawListener(new _cls4(view, ((Transition) (obj)), view1, arraylist, ((Transition) (obj1)), arraylist1, ((Transition) (obj2)), arraylist2, map, arraylist3, ((Transition) (obj3))));
        }
    }

    public static Object cloneTransition(Object obj)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = ((Transition)obj).clone();
        }
        return obj1;
    }

    public static void excludeTarget(Object obj, View view, boolean flag)
    {
        ((Transition)obj).excludeTarget(view, flag);
    }

    public static void findNamedViews(Map map, View view)
    {
        if (view.getVisibility() == 0)
        {
            String s = view.getTransitionName();
            if (s != null)
            {
                map.put(s, view);
            }
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                int j = view.getChildCount();
                for (int i = 0; i < j; i++)
                {
                    findNamedViews(map, view.getChildAt(i));
                }

            }
        }
    }

    private static Rect getBoundsOnScreen(View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        return rect;
    }

    public static String getTransitionName(View view)
    {
        return view.getTransitionName();
    }

    private static boolean hasSimpleTarget(Transition transition)
    {
        return !isNullOrEmpty(transition.getTargetIds()) || !isNullOrEmpty(transition.getTargetNames()) || !isNullOrEmpty(transition.getTargetTypes());
    }

    private static boolean isNullOrEmpty(List list)
    {
        return list == null || list.isEmpty();
    }

    public static Object mergeTransitions(Object obj, Object obj1, Object obj2, boolean flag)
    {
        boolean flag2 = true;
        Transition transition = (Transition)obj;
        obj = (Transition)obj1;
        obj2 = (Transition)obj2;
        boolean flag1 = flag2;
        if (transition != null)
        {
            flag1 = flag2;
            if (obj != null)
            {
                flag1 = flag;
            }
        }
        if (flag1)
        {
            obj1 = new TransitionSet();
            if (transition != null)
            {
                ((TransitionSet) (obj1)).addTransition(transition);
            }
            if (obj != null)
            {
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
            }
            if (obj2 != null)
            {
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
            }
            return obj1;
        }
        obj1 = null;
        if (obj != null && transition != null)
        {
            obj = (new TransitionSet()).addTransition(((Transition) (obj))).addTransition(transition).setOrdering(1);
        } else
        if (obj == null)
        {
            obj = obj1;
            if (transition != null)
            {
                obj = transition;
            }
        }
        if (obj2 != null)
        {
            obj1 = new TransitionSet();
            if (obj != null)
            {
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
            }
            ((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
            return obj1;
        } else
        {
            return obj;
        }
    }

    public static void removeTargets(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        if (obj instanceof TransitionSet)
        {
            obj = (TransitionSet)obj;
            int k = ((TransitionSet) (obj)).getTransitionCount();
            for (int i = 0; i < k; i++)
            {
                removeTargets(((TransitionSet) (obj)).getTransitionAt(i), arraylist);
            }

        } else
        if (!hasSimpleTarget(((Transition) (obj))))
        {
            List list = ((Transition) (obj)).getTargets();
            if (list != null && list.size() == arraylist.size() && list.containsAll(arraylist))
            {
                for (int j = arraylist.size() - 1; j >= 0; j--)
                {
                    ((Transition) (obj)).removeTarget((View)arraylist.get(j));
                }

            }
        }
    }

    public static void setEpicenter(Object obj, View view)
    {
        ((Transition)obj).setEpicenterCallback(new _cls1(getBoundsOnScreen(view)));
    }

    private static void setSharedElementEpicenter(Transition transition, EpicenterView epicenterview)
    {
        if (transition != null)
        {
            transition.setEpicenterCallback(new _cls3(epicenterview));
        }
    }



    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}

}
