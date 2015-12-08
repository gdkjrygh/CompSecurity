// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.v7.widget:
//            Space

public class GridLayout extends ViewGroup
{
    public static abstract class Alignment
    {

        abstract int getAlignmentValue(View view, int i, int j);

        Bounds getBounds()
        {
            return new Bounds();
        }

        abstract String getDebugString();

        abstract int getGravityOffset(View view, int i);

        int getSizeInCell(View view, int i, int j)
        {
            return i;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Alignment:").append(getDebugString()).toString();
        }

        Alignment()
        {
        }
    }

    static final class Arc
    {

        public final Interval span;
        public boolean valid;
        public final MutableInt value;

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(span).append(" ");
            String s;
            if (!valid)
            {
                s = "+>";
            } else
            {
                s = "->";
            }
            return stringbuilder.append(s).append(" ").append(value).toString();
        }

        public Arc(Interval interval, MutableInt mutableint)
        {
            valid = true;
            span = interval;
            value = mutableint;
        }
    }

    static final class Assoc extends ArrayList
    {

        private final Class keyType;
        private final Class valueType;

        public static Assoc of(Class class1, Class class2)
        {
            return new Assoc(class1, class2);
        }

        public PackedMap pack()
        {
            int j = size();
            Object aobj[] = (Object[])(Object[])Array.newInstance(keyType, j);
            Object aobj1[] = (Object[])(Object[])Array.newInstance(valueType, j);
            for (int i = 0; i < j; i++)
            {
                aobj[i] = ((Pair)get(i)).first;
                aobj1[i] = ((Pair)get(i)).second;
            }

            return new PackedMap(aobj, aobj1);
        }

        public void put(Object obj, Object obj1)
        {
            add(Pair.create(obj, obj1));
        }

        private Assoc(Class class1, Class class2)
        {
            keyType = class1;
            valueType = class2;
        }
    }

    final class Axis
    {

        static final boolean $assertionsDisabled;
        private static final int COMPLETE = 2;
        private static final int NEW = 0;
        private static final int PENDING = 1;
        public Arc arcs[];
        public boolean arcsValid;
        PackedMap backwardLinks;
        public boolean backwardLinksValid;
        public int definedCount;
        public int deltas[];
        PackedMap forwardLinks;
        public boolean forwardLinksValid;
        PackedMap groupBounds;
        public boolean groupBoundsValid;
        public boolean hasWeights;
        public boolean hasWeightsValid;
        public final boolean horizontal;
        public int leadingMargins[];
        public boolean leadingMarginsValid;
        public int locations[];
        public boolean locationsValid;
        private int maxIndex;
        boolean orderPreserved;
        private MutableInt parentMax;
        private MutableInt parentMin;
        final GridLayout this$0;
        public int trailingMargins[];
        public boolean trailingMarginsValid;

        private void addComponentSizes(List list, PackedMap packedmap)
        {
            for (int i = 0; i < ((Interval[])packedmap.keys).length; i++)
            {
                include(list, ((Interval[])packedmap.keys)[i], ((MutableInt[])packedmap.values)[i], false);
            }

        }

        private String arcsToString(List list)
        {
            String s;
            StringBuilder stringbuilder;
            Iterator iterator;
            boolean flag;
            if (horizontal)
            {
                s = "x";
            } else
            {
                s = "y";
            }
            stringbuilder = new StringBuilder();
            flag = true;
            iterator = list.iterator();
            list = stringbuilder;
            while (iterator.hasNext()) 
            {
                Object obj = (Arc)iterator.next();
                int i;
                int j;
                int k;
                if (flag)
                {
                    flag = false;
                } else
                {
                    list = list.append(", ");
                }
                i = ((Arc) (obj)).span.min;
                j = ((Arc) (obj)).span.max;
                k = ((Arc) (obj)).value.value;
                if (i < j)
                {
                    obj = (new StringBuilder()).append(s).append(j).append("-").append(s).append(i).append(">=").append(k).toString();
                } else
                {
                    obj = (new StringBuilder()).append(s).append(i).append("-").append(s).append(j).append("<=").append(-k).toString();
                }
                list.append(((String) (obj)));
            }
            return list.toString();
        }

        private int calculateMaxIndex()
        {
            int i = -1;
            int j = 0;
            int k = getChildCount();
            while (j < k) 
            {
                Object obj = getChildAt(j);
                obj = getLayoutParams(((View) (obj)));
                if (horizontal)
                {
                    obj = ((LayoutParams) (obj)).columnSpec;
                } else
                {
                    obj = ((LayoutParams) (obj)).rowSpec;
                }
                obj = ((Spec) (obj)).span;
                i = Math.max(Math.max(Math.max(i, ((Interval) (obj)).min), ((Interval) (obj)).max), ((Interval) (obj)).size());
                j++;
            }
            j = i;
            if (i == -1)
            {
                j = 0x80000000;
            }
            return j;
        }

        private float calculateTotalWeight()
        {
            float f = 0.0F;
            int i = 0;
            int j = getChildCount();
            while (i < j) 
            {
                Object obj = getChildAt(i);
                if (((View) (obj)).getVisibility() != 8)
                {
                    obj = getLayoutParams(((View) (obj)));
                    if (horizontal)
                    {
                        obj = ((LayoutParams) (obj)).columnSpec;
                    } else
                    {
                        obj = ((LayoutParams) (obj)).rowSpec;
                    }
                    f += ((Spec) (obj)).weight;
                }
                i++;
            }
            return f;
        }

        private void computeArcs()
        {
            getForwardLinks();
            getBackwardLinks();
        }

        private void computeGroupBounds()
        {
            Bounds abounds[] = (Bounds[])groupBounds.values;
            for (int i = 0; i < abounds.length; i++)
            {
                abounds[i].reset();
            }

            int j = 0;
            int l = getChildCount();
            while (j < l) 
            {
                View view = getChildAt(j);
                Object obj = getLayoutParams(view);
                int k;
                int i1;
                if (horizontal)
                {
                    obj = ((LayoutParams) (obj)).columnSpec;
                } else
                {
                    obj = ((LayoutParams) (obj)).rowSpec;
                }
                i1 = getMeasurementIncludingMargin(view, horizontal);
                if (((Spec) (obj)).weight == 0.0F)
                {
                    k = 0;
                } else
                {
                    k = getDeltas()[j];
                }
                ((Bounds)groupBounds.getValue(j)).include(GridLayout.this, view, ((Spec) (obj)), this, i1 + k);
                j++;
            }
        }

        private boolean computeHasWeights()
        {
            int i;
            int j;
            i = 0;
            j = getChildCount();
_L2:
            Object obj;
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            obj = getChildAt(i);
            if (((View) (obj)).getVisibility() != 8)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            obj = getLayoutParams(((View) (obj)));
            if (horizontal)
            {
                obj = ((LayoutParams) (obj)).columnSpec;
            } else
            {
                obj = ((LayoutParams) (obj)).rowSpec;
            }
            if (((Spec) (obj)).weight == 0.0F) goto _L4; else goto _L3
_L3:
            return true;
            return false;
        }

        private void computeLinks(PackedMap packedmap, boolean flag)
        {
            Object aobj[] = (MutableInt[])packedmap.values;
            for (int i = 0; i < aobj.length; i++)
            {
                aobj[i].reset();
            }

            aobj = (Bounds[])getGroupBounds().values;
            int j = 0;
            while (j < aobj.length) 
            {
                int k = aobj[j].size(flag);
                MutableInt mutableint = (MutableInt)packedmap.getValue(j);
                int l = mutableint.value;
                if (!flag)
                {
                    k = -k;
                }
                mutableint.value = Math.max(l, k);
                j++;
            }
        }

        private void computeLocations(int ai[])
        {
            if (!hasWeights())
            {
                solve(ai);
            } else
            {
                solveAndDistributeSpace(ai);
            }
            if (!orderPreserved)
            {
                int j = ai[0];
                int i = 0;
                for (int k = ai.length; i < k; i++)
                {
                    ai[i] = ai[i] - j;
                }

            }
        }

        private void computeMargins(boolean flag)
        {
            int ai[];
            int i;
            int k;
            if (flag)
            {
                ai = leadingMargins;
            } else
            {
                ai = trailingMargins;
            }
            i = 0;
            k = getChildCount();
            while (i < k) 
            {
                View view = getChildAt(i);
                if (view.getVisibility() != 8)
                {
                    Object obj = getLayoutParams(view);
                    int j;
                    if (horizontal)
                    {
                        obj = ((LayoutParams) (obj)).columnSpec;
                    } else
                    {
                        obj = ((LayoutParams) (obj)).rowSpec;
                    }
                    obj = ((Spec) (obj)).span;
                    if (flag)
                    {
                        j = ((Interval) (obj)).min;
                    } else
                    {
                        j = ((Interval) (obj)).max;
                    }
                    ai[j] = Math.max(ai[j], getMargin1(view, horizontal, flag));
                }
                i++;
            }
        }

        private Arc[] createArcs()
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            addComponentSizes(arraylist, getForwardLinks());
            addComponentSizes(arraylist1, getBackwardLinks());
            if (orderPreserved)
            {
                for (int i = 0; i < getCount(); i++)
                {
                    include(arraylist, new Interval(i, i + 1), new MutableInt(0));
                }

            }
            int j = getCount();
            include(arraylist, new Interval(0, j), parentMin, false);
            include(arraylist1, new Interval(j, 0), parentMax, false);
            return (Arc[])GridLayout.append(topologicalSort(arraylist), topologicalSort(arraylist1));
        }

        private PackedMap createGroupBounds()
        {
            Assoc assoc = Assoc.of(android/support/v7/widget/GridLayout$Spec, android/support/v7/widget/GridLayout$Bounds);
            int i = 0;
            int j = getChildCount();
            while (i < j) 
            {
                Object obj = getChildAt(i);
                obj = getLayoutParams(((View) (obj)));
                if (horizontal)
                {
                    obj = ((LayoutParams) (obj)).columnSpec;
                } else
                {
                    obj = ((LayoutParams) (obj)).rowSpec;
                }
                assoc.put(obj, ((Spec) (obj)).getAbsoluteAlignment(horizontal).getBounds());
                i++;
            }
            return assoc.pack();
        }

        private PackedMap createLinks(boolean flag)
        {
            Assoc assoc = Assoc.of(android/support/v7/widget/GridLayout$Interval, android/support/v7/widget/GridLayout$MutableInt);
            Spec aspec[] = (Spec[])getGroupBounds().keys;
            int i = 0;
            int j = aspec.length;
            while (i < j) 
            {
                Interval interval;
                if (flag)
                {
                    interval = aspec[i].span;
                } else
                {
                    interval = aspec[i].span.inverse();
                }
                assoc.put(interval, new MutableInt());
                i++;
            }
            return assoc.pack();
        }

        private PackedMap getBackwardLinks()
        {
            if (backwardLinks == null)
            {
                backwardLinks = createLinks(false);
            }
            if (!backwardLinksValid)
            {
                computeLinks(backwardLinks, false);
                backwardLinksValid = true;
            }
            return backwardLinks;
        }

        private PackedMap getForwardLinks()
        {
            if (forwardLinks == null)
            {
                forwardLinks = createLinks(true);
            }
            if (!forwardLinksValid)
            {
                computeLinks(forwardLinks, true);
                forwardLinksValid = true;
            }
            return forwardLinks;
        }

        private int getMaxIndex()
        {
            if (maxIndex == 0x80000000)
            {
                maxIndex = Math.max(0, calculateMaxIndex());
            }
            return maxIndex;
        }

        private int getMeasure(int i, int j)
        {
            setParentConstraints(i, j);
            return size(getLocations());
        }

        private boolean hasWeights()
        {
            if (!hasWeightsValid)
            {
                hasWeights = computeHasWeights();
                hasWeightsValid = true;
            }
            return hasWeights;
        }

        private void include(List list, Interval interval, MutableInt mutableint)
        {
            include(list, interval, mutableint, true);
        }

        private void include(List list, Interval interval, MutableInt mutableint, boolean flag)
        {
label0:
            {
                if (interval.size() == 0)
                {
                    return;
                }
                if (!flag)
                {
                    break label0;
                }
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!((Arc)iterator.next()).span.equals(interval));
                return;
            }
            list.add(new Arc(interval, mutableint));
        }

        private void init(int ai[])
        {
            Arrays.fill(ai, 0);
        }

        private void logError(String s, Arc aarc[], boolean aflag[])
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            for (int i = 0; i < aarc.length; i++)
            {
                Arc arc = aarc[i];
                if (aflag[i])
                {
                    arraylist.add(arc);
                }
                if (!arc.valid)
                {
                    arraylist1.add(arc);
                }
            }

            mPrinter.println((new StringBuilder()).append(s).append(" constraints: ").append(arcsToString(arraylist)).append(" are inconsistent; permanently removing: ").append(arcsToString(arraylist1)).append(". ").toString());
        }

        private boolean relax(int ai[], Arc arc)
        {
            if (arc.valid)
            {
                Interval interval = arc.span;
                int j = interval.min;
                int i = interval.max;
                int k = arc.value.value;
                j = ai[j] + k;
                if (j > ai[i])
                {
                    ai[i] = j;
                    return true;
                }
            }
            return false;
        }

        private void setParentConstraints(int i, int j)
        {
            parentMin.value = i;
            parentMax.value = -j;
            locationsValid = false;
        }

        private void shareOutDelta(int i, float f)
        {
            Arrays.fill(deltas, 0);
            boolean flag = false;
            int l = getChildCount();
            int j = i;
            i = ((flag) ? 1 : 0);
            while (i < l) 
            {
                Object obj = getChildAt(i);
                float f1;
                int k;
                if (((View) (obj)).getVisibility() == 8)
                {
                    f1 = f;
                    k = j;
                } else
                {
                    obj = getLayoutParams(((View) (obj)));
                    float f2;
                    if (horizontal)
                    {
                        obj = ((LayoutParams) (obj)).columnSpec;
                    } else
                    {
                        obj = ((LayoutParams) (obj)).rowSpec;
                    }
                    f2 = ((Spec) (obj)).weight;
                    k = j;
                    f1 = f;
                    if (f2 != 0.0F)
                    {
                        k = Math.round(((float)j * f2) / f);
                        deltas[i] = k;
                        k = j - k;
                        f1 = f - f2;
                    }
                }
                i++;
                j = k;
                f = f1;
            }
        }

        private int size(int ai[])
        {
            return ai[getCount()];
        }

        private boolean solve(int ai[])
        {
            return solve(getArcs(), ai);
        }

        private boolean solve(Arc aarc[], int ai[])
        {
            return solve(aarc, ai, true);
        }

        private boolean solve(Arc aarc[], int ai[], boolean flag)
        {
            String s;
            boolean aflag[];
            int l1;
            if (horizontal)
            {
                s = "horizontal";
            } else
            {
                s = "vertical";
            }
            l1 = getCount() + 1;
            aflag = null;
label0:
            for (int i = 0; i < aarc.length; i++)
            {
                init(ai);
                for (int j = 0; j < l1; j++)
                {
                    boolean flag1 = false;
                    int i1 = 0;
                    for (int i2 = aarc.length; i1 < i2; i1++)
                    {
                        flag1 |= relax(ai, aarc[i1]);
                    }

                    if (!flag1)
                    {
                        if (aflag != null)
                        {
                            logError(s, aarc, aflag);
                        }
                        return true;
                    }
                }

                if (!flag)
                {
                    return false;
                }
                boolean aflag1[] = new boolean[aarc.length];
                for (int k = 0; k < l1; k++)
                {
                    int j1 = 0;
                    for (int k1 = aarc.length; j1 < k1; j1++)
                    {
                        aflag1[j1] = aflag1[j1] | relax(ai, aarc[j1]);
                    }

                }

                if (i == 0)
                {
                    aflag = aflag1;
                }
                int l = 0;
                Arc arc;
                do
                {
                    if (l >= aarc.length)
                    {
                        continue label0;
                    }
                    if (aflag1[l])
                    {
                        arc = aarc[l];
                        if (arc.span.min >= arc.span.max)
                        {
                            break;
                        }
                    }
                    l++;
                } while (true);
                arc.valid = false;
            }

            return true;
        }

        private void solveAndDistributeSpace(int ai[])
        {
            Arrays.fill(getDeltas(), 0);
            solve(ai);
            int k = parentMin.value * getChildCount() + 1;
            if (k >= 2)
            {
                int i = 0;
                float f = calculateTotalWeight();
                int j = -1;
                boolean flag = true;
                while (i < k) 
                {
                    int l = (i + k) / 2;
                    invalidateValues();
                    shareOutDelta(l, f);
                    flag = solve(getArcs(), ai, false);
                    if (flag)
                    {
                        j = l;
                        i = l + 1;
                    } else
                    {
                        k = l;
                    }
                }
                if (j > 0 && !flag)
                {
                    invalidateValues();
                    shareOutDelta(j, f);
                    solve(ai);
                    return;
                }
            }
        }

        private Arc[] topologicalSort(List list)
        {
            return topologicalSort((Arc[])list.toArray(new Arc[list.size()]));
        }

        private Arc[] topologicalSort(Arc aarc[])
        {
            return (aarc. new Object() {

                static final boolean $assertionsDisabled;
                Arc arcsByVertex[][];
                int cursor;
                Arc result[];
                final Axis this$1;
                final Arc val$arcs[];
                int visited[];

                Arc[] sort()
                {
                    int i = 0;
                    for (int j = arcsByVertex.length; i < j; i++)
                    {
                        walk(i);
                    }

                    if (!$assertionsDisabled && cursor != -1)
                    {
                        throw new AssertionError();
                    } else
                    {
                        return result;
                    }
                }

                void walk(int i)
                {
                    visited[i];
                    JVM INSTR tableswitch 0 1: default 28
                //                               0 29
                //                               1 116;
                       goto _L1 _L2 _L3
_L1:
                    return;
_L2:
                    visited[i] = 1;
                    Arc aarc[] = arcsByVertex[i];
                    int k = aarc.length;
                    for (int j = 0; j < k; j++)
                    {
                        Arc arc = aarc[j];
                        walk(arc.span.max);
                        Arc aarc1[] = result;
                        int l = cursor;
                        cursor = l - 1;
                        aarc1[l] = arc;
                    }

                    visited[i] = 2;
                    return;
_L3:
                    if (!$assertionsDisabled)
                    {
                        throw new AssertionError();
                    }
                    if (true) goto _L1; else goto _L4
_L4:
                }

                static 
                {
                    boolean flag;
                    if (!android/support/v7/widget/GridLayout.desiredAssertionStatus())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    $assertionsDisabled = flag;
                }

            
            {
                this$1 = final_axis;
                arcs = _5B_Landroid.support.v7.widget.Arc_3B_.this;
                super();
                result = new Arc[arcs.length];
                cursor = result.length - 1;
                arcsByVertex = groupArcsByFirstVertex(arcs);
                visited = new int[getCount() + 1];
            }
            }).sort();
        }

        public Arc[] getArcs()
        {
            if (arcs == null)
            {
                arcs = createArcs();
            }
            if (!arcsValid)
            {
                computeArcs();
                arcsValid = true;
            }
            return arcs;
        }

        public int getCount()
        {
            return Math.max(definedCount, getMaxIndex());
        }

        public int[] getDeltas()
        {
            if (deltas == null)
            {
                deltas = new int[getChildCount()];
            }
            return deltas;
        }

        public PackedMap getGroupBounds()
        {
            if (groupBounds == null)
            {
                groupBounds = createGroupBounds();
            }
            if (!groupBoundsValid)
            {
                computeGroupBounds();
                groupBoundsValid = true;
            }
            return groupBounds;
        }

        public int[] getLeadingMargins()
        {
            if (leadingMargins == null)
            {
                leadingMargins = new int[getCount() + 1];
            }
            if (!leadingMarginsValid)
            {
                computeMargins(true);
                leadingMarginsValid = true;
            }
            return leadingMargins;
        }

        public int[] getLocations()
        {
            if (locations == null)
            {
                locations = new int[getCount() + 1];
            }
            if (!locationsValid)
            {
                computeLocations(locations);
                locationsValid = true;
            }
            return locations;
        }

        public int getMeasure(int i)
        {
label0:
            {
label1:
                {
                    boolean flag = false;
                    int j = android.view.View.MeasureSpec.getMode(i);
                    i = android.view.View.MeasureSpec.getSize(i);
                    switch (j)
                    {
                    default:
                        i = ((flag) ? 1 : 0);
                        if (!$assertionsDisabled)
                        {
                            throw new AssertionError();
                        }
                        break;

                    case -2147483648: 
                        break label0;

                    case 1073741824: 
                        break label1;

                    case 0: // '\0'
                        i = getMeasure(0, 0x186a0);
                        break;
                    }
                    return i;
                }
                return getMeasure(i, i);
            }
            return getMeasure(0, i);
        }

        public int[] getTrailingMargins()
        {
            if (trailingMargins == null)
            {
                trailingMargins = new int[getCount() + 1];
            }
            if (!trailingMarginsValid)
            {
                computeMargins(false);
                trailingMarginsValid = true;
            }
            return trailingMargins;
        }

        Arc[][] groupArcsByFirstVertex(Arc aarc[])
        {
            int i = getCount() + 1;
            Arc aarc1[][] = new Arc[i][];
            int ai[] = new int[i];
            int i1 = aarc.length;
            for (int j = 0; j < i1; j++)
            {
                int j1 = aarc[j].span.min;
                ai[j1] = ai[j1] + 1;
            }

            for (int k = 0; k < ai.length; k++)
            {
                aarc1[k] = new Arc[ai[k]];
            }

            Arrays.fill(ai, 0);
            i1 = aarc.length;
            for (int l = 0; l < i1; l++)
            {
                Arc arc = aarc[l];
                int k1 = arc.span.min;
                Arc aarc2[] = aarc1[k1];
                int l1 = ai[k1];
                ai[k1] = l1 + 1;
                aarc2[l1] = arc;
            }

            return aarc1;
        }

        public void invalidateStructure()
        {
            maxIndex = 0x80000000;
            groupBounds = null;
            forwardLinks = null;
            backwardLinks = null;
            leadingMargins = null;
            trailingMargins = null;
            arcs = null;
            locations = null;
            deltas = null;
            hasWeightsValid = false;
            invalidateValues();
        }

        public void invalidateValues()
        {
            groupBoundsValid = false;
            forwardLinksValid = false;
            backwardLinksValid = false;
            leadingMarginsValid = false;
            trailingMarginsValid = false;
            arcsValid = false;
            locationsValid = false;
        }

        public boolean isOrderPreserved()
        {
            return orderPreserved;
        }

        public void layout(int i)
        {
            setParentConstraints(i, i);
            getLocations();
        }

        public void setCount(int i)
        {
            if (i != 0x80000000 && i < getMaxIndex())
            {
                StringBuilder stringbuilder = new StringBuilder();
                String s;
                if (horizontal)
                {
                    s = "column";
                } else
                {
                    s = "row";
                }
                GridLayout.handleInvalidParams(stringbuilder.append(s).append("Count must be greater than or equal to the maximum of all grid indices ").append("(and spans) defined in the LayoutParams of each child").toString());
            }
            definedCount = i;
        }

        public void setOrderPreserved(boolean flag)
        {
            orderPreserved = flag;
            invalidateStructure();
        }

        static 
        {
            boolean flag;
            if (!android/support/v7/widget/GridLayout.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        private Axis(boolean flag)
        {
            this$0 = GridLayout.this;
            super();
            definedCount = 0x80000000;
            maxIndex = 0x80000000;
            groupBoundsValid = false;
            forwardLinksValid = false;
            backwardLinksValid = false;
            leadingMarginsValid = false;
            trailingMarginsValid = false;
            arcsValid = false;
            locationsValid = false;
            hasWeightsValid = false;
            orderPreserved = true;
            parentMin = new MutableInt(0);
            parentMax = new MutableInt(0xfffe7960);
            horizontal = flag;
        }

    }

    static class Bounds
    {

        public int after;
        public int before;
        public int flexibility;

        protected int getOffset(GridLayout gridlayout, View view, Alignment alignment, int i, boolean flag)
        {
            return before - alignment.getAlignmentValue(view, i, ViewGroupCompat.getLayoutMode(gridlayout));
        }

        protected void include(int i, int j)
        {
            before = Math.max(before, i);
            after = Math.max(after, j);
        }

        protected final void include(GridLayout gridlayout, View view, Spec spec1, Axis axis, int i)
        {
            flexibility = flexibility & spec1.getFlexibility();
            int j = spec1.getAbsoluteAlignment(axis.horizontal).getAlignmentValue(view, i, ViewGroupCompat.getLayoutMode(gridlayout));
            include(j, i - j);
        }

        protected void reset()
        {
            before = 0x80000000;
            after = 0x80000000;
            flexibility = 2;
        }

        protected int size(boolean flag)
        {
            if (!flag && GridLayout.canStretch(flexibility))
            {
                return 0x186a0;
            } else
            {
                return before + after;
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append("Bounds{before=").append(before).append(", after=").append(after).append('}').toString();
        }

        private Bounds()
        {
            reset();
        }

    }

    static final class Interval
    {

        public final int max;
        public final int min;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Interval)obj;
                if (max != ((Interval) (obj)).max)
                {
                    return false;
                }
                if (min != ((Interval) (obj)).min)
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return min * 31 + max;
        }

        Interval inverse()
        {
            return new Interval(max, min);
        }

        int size()
        {
            return max - min;
        }

        public String toString()
        {
            return (new StringBuilder()).append("[").append(min).append(", ").append(max).append("]").toString();
        }

        public Interval(int i, int j)
        {
            min = i;
            max = j;
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int BOTTOM_MARGIN;
        private static final int COLUMN;
        private static final int COLUMN_SPAN;
        private static final int COLUMN_WEIGHT;
        private static final int DEFAULT_COLUMN = 0x80000000;
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_MARGIN = 0x80000000;
        private static final int DEFAULT_ROW = 0x80000000;
        private static final Interval DEFAULT_SPAN;
        private static final int DEFAULT_SPAN_SIZE;
        private static final int DEFAULT_WIDTH = -2;
        private static final int GRAVITY;
        private static final int LEFT_MARGIN;
        private static final int MARGIN;
        private static final int RIGHT_MARGIN;
        private static final int ROW;
        private static final int ROW_SPAN;
        private static final int ROW_WEIGHT;
        private static final int TOP_MARGIN;
        public Spec columnSpec;
        public Spec rowSpec;

        private void init(Context context, AttributeSet attributeset)
        {
            context = context.obtainStyledAttributes(attributeset, android.support.v7.gridlayout.R.styleable.GridLayout_Layout);
            int i = context.getInt(GRAVITY, 0);
            int j = context.getInt(COLUMN, 0x80000000);
            int k = context.getInt(COLUMN_SPAN, DEFAULT_SPAN_SIZE);
            float f = context.getFloat(COLUMN_WEIGHT, 0.0F);
            columnSpec = GridLayout.spec(j, k, GridLayout.getAlignment(i, true), f);
            j = context.getInt(ROW, 0x80000000);
            k = context.getInt(ROW_SPAN, DEFAULT_SPAN_SIZE);
            f = context.getFloat(ROW_WEIGHT, 0.0F);
            rowSpec = GridLayout.spec(j, k, GridLayout.getAlignment(i, false), f);
            context.recycle();
            return;
            attributeset;
            context.recycle();
            throw attributeset;
        }

        private void reInitSuper(Context context, AttributeSet attributeset)
        {
            context = context.obtainStyledAttributes(attributeset, android.support.v7.gridlayout.R.styleable.GridLayout_Layout);
            int i = context.getDimensionPixelSize(MARGIN, 0x80000000);
            leftMargin = context.getDimensionPixelSize(LEFT_MARGIN, i);
            topMargin = context.getDimensionPixelSize(TOP_MARGIN, i);
            rightMargin = context.getDimensionPixelSize(RIGHT_MARGIN, i);
            bottomMargin = context.getDimensionPixelSize(BOTTOM_MARGIN, i);
            context.recycle();
            return;
            attributeset;
            context.recycle();
            throw attributeset;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (LayoutParams)obj;
                if (!columnSpec.equals(((LayoutParams) (obj)).columnSpec))
                {
                    return false;
                }
                if (!rowSpec.equals(((LayoutParams) (obj)).rowSpec))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return rowSpec.hashCode() * 31 + columnSpec.hashCode();
        }

        protected void setBaseAttributes(TypedArray typedarray, int i, int j)
        {
            width = typedarray.getLayoutDimension(i, -2);
            height = typedarray.getLayoutDimension(j, -2);
        }

        final void setColumnSpecSpan(Interval interval)
        {
            columnSpec = columnSpec.copyWriteSpan(interval);
        }

        public void setGravity(int i)
        {
            rowSpec = rowSpec.copyWriteAlignment(GridLayout.getAlignment(i, false));
            columnSpec = columnSpec.copyWriteAlignment(GridLayout.getAlignment(i, true));
        }

        final void setRowSpecSpan(Interval interval)
        {
            rowSpec = rowSpec.copyWriteSpan(interval);
        }

        static 
        {
            DEFAULT_SPAN = new Interval(0x80000000, 0x80000001);
            DEFAULT_SPAN_SIZE = DEFAULT_SPAN.size();
            MARGIN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_android_layout_margin;
            LEFT_MARGIN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_android_layout_marginLeft;
            TOP_MARGIN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_android_layout_marginTop;
            RIGHT_MARGIN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_android_layout_marginRight;
            BOTTOM_MARGIN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_android_layout_marginBottom;
            COLUMN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_layout_column;
            COLUMN_SPAN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_layout_columnSpan;
            COLUMN_WEIGHT = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_layout_columnWeight;
            ROW = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_layout_row;
            ROW_SPAN = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_layout_rowSpan;
            ROW_WEIGHT = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_layout_rowWeight;
            GRAVITY = android.support.v7.gridlayout.R.styleable.GridLayout_Layout_layout_gravity;
        }

        public LayoutParams()
        {
            this(Spec.UNDEFINED, Spec.UNDEFINED);
        }

        private LayoutParams(int i, int j, int k, int l, int i1, int j1, Spec spec1, 
                Spec spec2)
        {
            super(i, j);
            rowSpec = Spec.UNDEFINED;
            columnSpec = Spec.UNDEFINED;
            setMargins(k, l, i1, j1);
            rowSpec = spec1;
            columnSpec = spec2;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            rowSpec = Spec.UNDEFINED;
            columnSpec = Spec.UNDEFINED;
            reInitSuper(context, attributeset);
            init(context, attributeset);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            rowSpec = Spec.UNDEFINED;
            columnSpec = Spec.UNDEFINED;
            rowSpec = layoutparams.rowSpec;
            columnSpec = layoutparams.columnSpec;
        }

        public LayoutParams(Spec spec1, Spec spec2)
        {
            this(-2, -2, 0x80000000, 0x80000000, 0x80000000, 0x80000000, spec1, spec2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            rowSpec = Spec.UNDEFINED;
            columnSpec = Spec.UNDEFINED;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            rowSpec = Spec.UNDEFINED;
            columnSpec = Spec.UNDEFINED;
        }
    }

    static final class MutableInt
    {

        public int value;

        public void reset()
        {
            value = 0x80000000;
        }

        public String toString()
        {
            return Integer.toString(value);
        }

        public MutableInt()
        {
            reset();
        }

        public MutableInt(int i)
        {
            value = i;
        }
    }

    static final class PackedMap
    {

        public final int index[];
        public final Object keys[];
        public final Object values[];

        private static Object[] compact(Object aobj[], int ai[])
        {
            int j = aobj.length;
            Object aobj1[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), GridLayout.max2(ai, -1) + 1);
            for (int i = 0; i < j; i++)
            {
                aobj1[ai[i]] = aobj[i];
            }

            return aobj1;
        }

        private static int[] createIndex(Object aobj[])
        {
            int j = aobj.length;
            int ai[] = new int[j];
            HashMap hashmap = new HashMap();
            for (int i = 0; i < j; i++)
            {
                Object obj = aobj[i];
                Integer integer1 = (Integer)hashmap.get(obj);
                Integer integer = integer1;
                if (integer1 == null)
                {
                    integer = Integer.valueOf(hashmap.size());
                    hashmap.put(obj, integer);
                }
                ai[i] = integer.intValue();
            }

            return ai;
        }

        public Object getValue(int i)
        {
            return values[index[i]];
        }

        private PackedMap(Object aobj[], Object aobj1[])
        {
            index = createIndex(aobj);
            keys = compact(aobj, index);
            values = compact(aobj1, index);
        }

    }

    public static class Spec
    {

        static final float DEFAULT_WEIGHT = 0F;
        static final Spec UNDEFINED = GridLayout.spec(0x80000000);
        final Alignment alignment;
        final Interval span;
        final boolean startDefined;
        final float weight;

        final Spec copyWriteAlignment(Alignment alignment1)
        {
            return new Spec(startDefined, span, alignment1, weight);
        }

        final Spec copyWriteSpan(Interval interval)
        {
            return new Spec(startDefined, interval, alignment, weight);
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Spec)obj;
                if (!alignment.equals(((Spec) (obj)).alignment))
                {
                    return false;
                }
                if (!span.equals(((Spec) (obj)).span))
                {
                    return false;
                }
            }
            return true;
        }

        public Alignment getAbsoluteAlignment(boolean flag)
        {
            if (alignment != GridLayout.UNDEFINED_ALIGNMENT)
            {
                return alignment;
            }
            if (weight == 0.0F)
            {
                if (flag)
                {
                    return GridLayout.START;
                } else
                {
                    return GridLayout.BASELINE;
                }
            } else
            {
                return GridLayout.FILL;
            }
        }

        final int getFlexibility()
        {
            return alignment != GridLayout.UNDEFINED_ALIGNMENT || weight != 0.0F ? 2 : 0;
        }

        public int hashCode()
        {
            return span.hashCode() * 31 + alignment.hashCode();
        }


        private Spec(boolean flag, int i, int j, Alignment alignment1, float f)
        {
            this(flag, new Interval(i, i + j), alignment1, f);
        }


        private Spec(boolean flag, Interval interval, Alignment alignment1, float f)
        {
            startDefined = flag;
            span = interval;
            alignment = alignment1;
            weight = f;
        }
    }


    private static final int ALIGNMENT_MODE;
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final Alignment BASELINE = new Alignment() {

        public int getAlignmentValue(View view, int i, int j)
        {
            if (view.getVisibility() == 8)
            {
                i = 0;
            } else
            {
                j = view.getBaseline();
                i = j;
                if (j == -1)
                {
                    return 0x80000000;
                }
            }
            return i;
        }

        public Bounds getBounds()
        {
            return new Bounds() {

                private int size;
                final _cls7 this$0;

                protected int getOffset(GridLayout gridlayout, View view, Alignment alignment, int i, boolean flag)
                {
                    return Math.max(0, super.getOffset(gridlayout, view, alignment, i, flag));
                }

                protected void include(int i, int j)
                {
                    super.include(i, j);
                    size = Math.max(size, i + j);
                }

                protected void reset()
                {
                    super.reset();
                    size = 0x80000000;
                }

                protected int size(boolean flag)
                {
                    return Math.max(super.size(flag), size);
                }

            
            {
                this$0 = _cls7.this;
                super();
            }
            };
        }

        String getDebugString()
        {
            return "BASELINE";
        }

        int getGravityOffset(View view, int i)
        {
            return 0;
        }

    };
    public static final Alignment BOTTOM;
    private static final int CAN_STRETCH = 2;
    public static final Alignment CENTER = new Alignment() {

        public int getAlignmentValue(View view, int i, int j)
        {
            return i >> 1;
        }

        String getDebugString()
        {
            return "CENTER";
        }

        int getGravityOffset(View view, int i)
        {
            return i >> 1;
        }

    };
    private static final int COLUMN_COUNT;
    private static final int COLUMN_ORDER_PRESERVED;
    private static final int DEFAULT_ALIGNMENT_MODE = 1;
    static final int DEFAULT_CONTAINER_MARGIN = 0;
    private static final int DEFAULT_COUNT = 0x80000000;
    private static final boolean DEFAULT_ORDER_PRESERVED = true;
    private static final int DEFAULT_ORIENTATION = 0;
    private static final boolean DEFAULT_USE_DEFAULT_MARGINS = false;
    public static final Alignment END;
    public static final Alignment FILL = new Alignment() {

        public int getAlignmentValue(View view, int i, int j)
        {
            return 0x80000000;
        }

        String getDebugString()
        {
            return "FILL";
        }

        int getGravityOffset(View view, int i)
        {
            return 0;
        }

        public int getSizeInCell(View view, int i, int j)
        {
            return j;
        }

    };
    public static final int HORIZONTAL = 0;
    private static final int INFLEXIBLE = 0;
    private static final Alignment LEADING;
    public static final Alignment LEFT;
    static final Printer LOG_PRINTER = new LogPrinter(3, android/support/v7/widget/GridLayout.getName());
    static final int MAX_SIZE = 0x186a0;
    static final Printer NO_PRINTER = new Printer() {

        public void println(String s)
        {
        }

    };
    private static final int ORIENTATION;
    public static final Alignment RIGHT;
    private static final int ROW_COUNT;
    private static final int ROW_ORDER_PRESERVED;
    public static final Alignment START;
    public static final Alignment TOP;
    private static final Alignment TRAILING;
    public static final int UNDEFINED = 0x80000000;
    static final Alignment UNDEFINED_ALIGNMENT = new Alignment() {

        public int getAlignmentValue(View view, int i, int j)
        {
            return 0x80000000;
        }

        String getDebugString()
        {
            return "UNDEFINED";
        }

        int getGravityOffset(View view, int i)
        {
            return 0x80000000;
        }

    };
    static final int UNINITIALIZED_HASH = 0;
    private static final int USE_DEFAULT_MARGINS;
    public static final int VERTICAL = 1;
    int mAlignmentMode;
    int mDefaultGap;
    final Axis mHorizontalAxis;
    int mLastLayoutParamsHashCode;
    int mOrientation;
    Printer mPrinter;
    boolean mUseDefaultMargins;
    final Axis mVerticalAxis;

    public GridLayout(Context context)
    {
        this(context, null);
    }

    public GridLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GridLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mHorizontalAxis = new Axis(true);
        mVerticalAxis = new Axis(false);
        mOrientation = 0;
        mUseDefaultMargins = false;
        mAlignmentMode = 1;
        mLastLayoutParamsHashCode = 0;
        mPrinter = LOG_PRINTER;
        mDefaultGap = context.getResources().getDimensionPixelOffset(android.support.v7.gridlayout.R.dimen.default_gap);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.gridlayout.R.styleable.GridLayout);
        setRowCount(context.getInt(ROW_COUNT, 0x80000000));
        setColumnCount(context.getInt(COLUMN_COUNT, 0x80000000));
        setOrientation(context.getInt(ORIENTATION, 0));
        setUseDefaultMargins(context.getBoolean(USE_DEFAULT_MARGINS, false));
        setAlignmentMode(context.getInt(ALIGNMENT_MODE, 1));
        setRowOrderPreserved(context.getBoolean(ROW_ORDER_PRESERVED, true));
        setColumnOrderPreserved(context.getBoolean(COLUMN_ORDER_PRESERVED, true));
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    static int adjust(int i, int j)
    {
        return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i + j), android.view.View.MeasureSpec.getMode(i));
    }

    static Object[] append(Object aobj[], Object aobj1[])
    {
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), aobj.length + aobj1.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 0, aobj.length);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), aobj.length, aobj1.length);
        return aobj2;
    }

    static boolean canStretch(int i)
    {
        return (i & 2) != 0;
    }

    private void checkLayoutParams(LayoutParams layoutparams, boolean flag)
    {
        String s;
        Interval interval;
        int i;
        if (flag)
        {
            s = "column";
        } else
        {
            s = "row";
        }
        if (flag)
        {
            layoutparams = layoutparams.columnSpec;
        } else
        {
            layoutparams = layoutparams.rowSpec;
        }
        interval = ((Spec) (layoutparams)).span;
        if (interval.min != 0x80000000 && interval.min < 0)
        {
            handleInvalidParams((new StringBuilder()).append(s).append(" indices must be positive").toString());
        }
        if (flag)
        {
            layoutparams = mHorizontalAxis;
        } else
        {
            layoutparams = mVerticalAxis;
        }
        i = ((Axis) (layoutparams)).definedCount;
        if (i != 0x80000000)
        {
            if (interval.max > i)
            {
                handleInvalidParams((new StringBuilder()).append(s).append(" indices (start + span) mustn't exceed the ").append(s).append(" count").toString());
            }
            if (interval.size() > i)
            {
                handleInvalidParams((new StringBuilder()).append(s).append(" span mustn't exceed the ").append(s).append(" count").toString());
            }
        }
    }

    private static int clip(Interval interval, boolean flag, int i)
    {
        int k = interval.size();
        if (i == 0)
        {
            return k;
        }
        int j;
        if (flag)
        {
            j = Math.min(interval.min, i);
        } else
        {
            j = 0;
        }
        return Math.min(k, i - j);
    }

    private int computeLayoutParamsHashCode()
    {
        int j = 1;
        int i = 0;
        int k = getChildCount();
        while (i < k) 
        {
            View view = getChildAt(i);
            if (view.getVisibility() != 8)
            {
                j = j * 31 + ((LayoutParams)view.getLayoutParams()).hashCode();
            }
            i++;
        }
        return j;
    }

    private void consistencyCheck()
    {
        if (mLastLayoutParamsHashCode == 0)
        {
            validateLayoutParams();
            mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
        } else
        if (mLastLayoutParamsHashCode != computeLayoutParamsHashCode())
        {
            mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            invalidateStructure();
            consistencyCheck();
            return;
        }
    }

    private static Alignment createSwitchingAlignment(Alignment alignment, Alignment alignment1)
    {
        return new Alignment(alignment, alignment1) {

            final Alignment val$ltr;
            final Alignment val$rtl;

            public int getAlignmentValue(View view, int i, int j)
            {
                boolean flag = true;
                Alignment alignment2;
                if (ViewCompat.getLayoutDirection(view) != 1)
                {
                    flag = false;
                }
                if (!flag)
                {
                    alignment2 = ltr;
                } else
                {
                    alignment2 = rtl;
                }
                return alignment2.getAlignmentValue(view, i, j);
            }

            String getDebugString()
            {
                return (new StringBuilder()).append("SWITCHING[L:").append(ltr.getDebugString()).append(", R:").append(rtl.getDebugString()).append("]").toString();
            }

            int getGravityOffset(View view, int i)
            {
                boolean flag = true;
                Alignment alignment2;
                if (ViewCompat.getLayoutDirection(view) != 1)
                {
                    flag = false;
                }
                if (!flag)
                {
                    alignment2 = ltr;
                } else
                {
                    alignment2 = rtl;
                }
                return alignment2.getGravityOffset(view, i);
            }

            
            {
                ltr = alignment;
                rtl = alignment1;
                super();
            }
        };
    }

    private void drawLine(Canvas canvas, int i, int j, int k, int l, Paint paint)
    {
        if (isLayoutRtlCompat())
        {
            int i1 = getWidth();
            canvas.drawLine(i1 - i, j, i1 - k, l, paint);
            return;
        } else
        {
            canvas.drawLine(i, j, k, l, paint);
            return;
        }
    }

    private static boolean fits(int ai[], int i, int j, int k)
    {
        if (k <= ai.length) goto _L2; else goto _L1
_L1:
        return false;
_L2:
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                if (ai[j] > i)
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    static Alignment getAlignment(int i, boolean flag)
    {
        byte byte0;
        int j;
        if (flag)
        {
            byte0 = 7;
        } else
        {
            byte0 = 112;
        }
        if (flag)
        {
            j = 0;
        } else
        {
            j = 4;
        }
        switch ((i & byte0) >> j)
        {
        default:
            return UNDEFINED_ALIGNMENT;

        case 3: // '\003'
            if (flag)
            {
                return LEFT;
            } else
            {
                return TOP;
            }

        case 5: // '\005'
            if (flag)
            {
                return RIGHT;
            } else
            {
                return BOTTOM;
            }

        case 7: // '\007'
            return FILL;

        case 1: // '\001'
            return CENTER;

        case 8388611: 
            return START;

        case 8388613: 
            return END;
        }
    }

    private int getDefaultMargin(View view, LayoutParams layoutparams, boolean flag, boolean flag1)
    {
        Axis axis;
        boolean flag2;
        boolean flag3;
        flag3 = true;
        if (!mUseDefaultMargins)
        {
            return 0;
        }
        if (flag)
        {
            layoutparams = layoutparams.columnSpec;
        } else
        {
            layoutparams = layoutparams.rowSpec;
        }
        if (flag)
        {
            axis = mHorizontalAxis;
        } else
        {
            axis = mVerticalAxis;
        }
        layoutparams = ((Spec) (layoutparams)).span;
        if (flag && isLayoutRtlCompat())
        {
            if (!flag1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
        } else
        {
            flag2 = flag1;
        }
        if (!flag2) goto _L2; else goto _L1
_L1:
        if (((Interval) (layoutparams)).min == 0)
        {
            flag2 = flag3;
        } else
        {
            flag2 = false;
        }
_L4:
        return getDefaultMargin(view, flag2, flag, flag1);
_L2:
        flag2 = flag3;
        if (((Interval) (layoutparams)).max != axis.getCount())
        {
            flag2 = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getDefaultMargin(View view, boolean flag, boolean flag1)
    {
        if (view.getClass() == android/support/v7/widget/Space)
        {
            return 0;
        } else
        {
            return mDefaultGap / 2;
        }
    }

    private int getDefaultMargin(View view, boolean flag, boolean flag1, boolean flag2)
    {
        return getDefaultMargin(view, flag1, flag2);
    }

    private int getMargin(View view, boolean flag, boolean flag1)
    {
        if (mAlignmentMode == 1)
        {
            return getMargin1(view, flag, flag1);
        }
        Object obj;
        int i;
        if (flag)
        {
            obj = mHorizontalAxis;
        } else
        {
            obj = mVerticalAxis;
        }
        if (flag1)
        {
            obj = ((Axis) (obj)).getLeadingMargins();
        } else
        {
            obj = ((Axis) (obj)).getTrailingMargins();
        }
        view = getLayoutParams(view);
        if (flag)
        {
            view = ((LayoutParams) (view)).columnSpec;
        } else
        {
            view = ((LayoutParams) (view)).rowSpec;
        }
        if (flag1)
        {
            i = ((Spec) (view)).span.min;
        } else
        {
            i = ((Spec) (view)).span.max;
        }
        return obj[i];
    }

    private int getMeasurement(View view, boolean flag)
    {
        if (flag)
        {
            return view.getMeasuredWidth();
        } else
        {
            return view.getMeasuredHeight();
        }
    }

    private int getTotalMargin(View view, boolean flag)
    {
        return getMargin(view, flag, true) + getMargin(view, flag, false);
    }

    private static void handleInvalidParams(String s)
    {
        throw new IllegalArgumentException((new StringBuilder()).append(s).append(". ").toString());
    }

    private void invalidateStructure()
    {
        mLastLayoutParamsHashCode = 0;
        if (mHorizontalAxis != null)
        {
            mHorizontalAxis.invalidateStructure();
        }
        if (mVerticalAxis != null)
        {
            mVerticalAxis.invalidateStructure();
        }
        invalidateValues();
    }

    private void invalidateValues()
    {
        if (mHorizontalAxis != null && mVerticalAxis != null)
        {
            mHorizontalAxis.invalidateValues();
            mVerticalAxis.invalidateValues();
        }
    }

    private boolean isLayoutRtlCompat()
    {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    static int max2(int ai[], int i)
    {
        boolean flag = false;
        int k = ai.length;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < k; i++)
        {
            j = Math.max(j, ai[i]);
        }

        return j;
    }

    private void measureChildWithMargins2(View view, int i, int j, int k, int l)
    {
        view.measure(getChildMeasureSpec(i, getTotalMargin(view, true), k), getChildMeasureSpec(j, getTotalMargin(view, false), l));
    }

    private void measureChildrenWithMargins(int i, int j, boolean flag)
    {
        int k = 0;
        int l = getChildCount();
        while (k < l) 
        {
            View view = getChildAt(k);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = getLayoutParams(view);
                if (flag)
                {
                    measureChildWithMargins2(view, i, j, layoutparams.width, layoutparams.height);
                } else
                {
                    Object obj;
                    boolean flag1;
                    if (mOrientation == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        obj = layoutparams.columnSpec;
                    } else
                    {
                        obj = layoutparams.rowSpec;
                    }
                    if (((Spec) (obj)).getAbsoluteAlignment(flag1) == FILL)
                    {
                        Interval interval = ((Spec) (obj)).span;
                        int i1;
                        if (flag1)
                        {
                            obj = mHorizontalAxis;
                        } else
                        {
                            obj = mVerticalAxis;
                        }
                        obj = ((Axis) (obj)).getLocations();
                        i1 = obj[interval.max] - obj[interval.min] - getTotalMargin(view, flag1);
                        if (flag1)
                        {
                            measureChildWithMargins2(view, i, j, i1, layoutparams.height);
                        } else
                        {
                            measureChildWithMargins2(view, i, j, layoutparams.width, i1);
                        }
                    }
                }
            }
            k++;
        }
    }

    private static void procrusteanFill(int ai[], int i, int j, int k)
    {
        int l = ai.length;
        Arrays.fill(ai, Math.min(i, l), Math.min(j, l), k);
    }

    private static void setCellGroup(LayoutParams layoutparams, int i, int j, int k, int l)
    {
        layoutparams.setRowSpecSpan(new Interval(i, i + j));
        layoutparams.setColumnSpecSpan(new Interval(k, k + l));
    }

    public static Spec spec(int i)
    {
        return spec(i, 1);
    }

    public static Spec spec(int i, float f)
    {
        return spec(i, 1, f);
    }

    public static Spec spec(int i, int j)
    {
        return spec(i, j, UNDEFINED_ALIGNMENT);
    }

    public static Spec spec(int i, int j, float f)
    {
        return spec(i, j, UNDEFINED_ALIGNMENT, f);
    }

    public static Spec spec(int i, int j, Alignment alignment)
    {
        return spec(i, j, alignment, 0.0F);
    }

    public static Spec spec(int i, int j, Alignment alignment, float f)
    {
        boolean flag;
        if (i != 0x80000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new Spec(flag, i, j, alignment, f);
    }

    public static Spec spec(int i, Alignment alignment)
    {
        return spec(i, 1, alignment);
    }

    public static Spec spec(int i, Alignment alignment, float f)
    {
        return spec(i, 1, alignment, f);
    }

    private void validateLayoutParams()
    {
        Object obj;
        int ai[];
        int i;
        int j;
        boolean flag;
        int k1;
        int l1;
        int i2;
        if (mOrientation == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = mHorizontalAxis;
        } else
        {
            obj = mVerticalAxis;
        }
        if (((Axis) (obj)).definedCount != 0x80000000)
        {
            k1 = ((Axis) (obj)).definedCount;
        } else
        {
            k1 = 0;
        }
        i = 0;
        j = 0;
        ai = new int[k1];
        l1 = 0;
        i2 = getChildCount();
        while (l1 < i2) 
        {
            LayoutParams layoutparams;
            int i1;
            int j1;
            int j2;
            int k2;
label0:
            {
label1:
                {
                    layoutparams = (LayoutParams)getChildAt(l1).getLayoutParams();
                    Interval interval;
                    int k;
                    int l;
                    boolean flag1;
                    boolean flag2;
                    if (flag)
                    {
                        obj = layoutparams.rowSpec;
                    } else
                    {
                        obj = layoutparams.columnSpec;
                    }
                    interval = ((Spec) (obj)).span;
                    flag1 = ((Spec) (obj)).startDefined;
                    j2 = interval.size();
                    if (flag1)
                    {
                        i = interval.min;
                    }
                    if (flag)
                    {
                        obj = layoutparams.columnSpec;
                    } else
                    {
                        obj = layoutparams.rowSpec;
                    }
                    interval = ((Spec) (obj)).span;
                    flag2 = ((Spec) (obj)).startDefined;
                    k2 = clip(interval, flag2, k1);
                    if (flag2)
                    {
                        j = interval.min;
                    }
                    i1 = i;
                    j1 = j;
                    if (k1 == 0)
                    {
                        break label0;
                    }
                    k = i;
                    l = j;
                    if (flag1)
                    {
                        i1 = i;
                        j1 = j;
                        if (flag2)
                        {
                            break label1;
                        }
                        l = j;
                        k = i;
                    }
                    do
                    {
                        i1 = k;
                        j1 = l;
                        if (fits(ai, k, l, l + k2))
                        {
                            break;
                        }
                        if (flag2)
                        {
                            k++;
                        } else
                        if (l + k2 <= k1)
                        {
                            l++;
                        } else
                        {
                            l = 0;
                            k++;
                        }
                    } while (true);
                }
                procrusteanFill(ai, j1, j1 + k2, i1 + j2);
            }
            if (flag)
            {
                setCellGroup(layoutparams, i1, j2, j1, k2);
            } else
            {
                setCellGroup(layoutparams, j1, k2, i1, j2);
            }
            j = j1 + k2;
            l1++;
            i = i1;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!(layoutparams instanceof LayoutParams))
        {
            return false;
        } else
        {
            layoutparams = (LayoutParams)layoutparams;
            checkLayoutParams(((LayoutParams) (layoutparams)), true);
            checkLayoutParams(((LayoutParams) (layoutparams)), false);
            return true;
        }
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public int getAlignmentMode()
    {
        return mAlignmentMode;
    }

    public int getColumnCount()
    {
        return mHorizontalAxis.getCount();
    }

    final LayoutParams getLayoutParams(View view)
    {
        return (LayoutParams)view.getLayoutParams();
    }

    int getMargin1(View view, boolean flag, boolean flag1)
    {
        LayoutParams layoutparams = getLayoutParams(view);
        int i;
        int j;
        if (flag)
        {
            if (flag1)
            {
                i = layoutparams.leftMargin;
            } else
            {
                i = layoutparams.rightMargin;
            }
        } else
        if (flag1)
        {
            i = layoutparams.topMargin;
        } else
        {
            i = layoutparams.bottomMargin;
        }
        j = i;
        if (i == 0x80000000)
        {
            j = getDefaultMargin(view, layoutparams, flag, flag1);
        }
        return j;
    }

    final int getMeasurementIncludingMargin(View view, boolean flag)
    {
        if (view.getVisibility() == 8)
        {
            return 0;
        } else
        {
            return getMeasurement(view, flag) + getTotalMargin(view, flag);
        }
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public Printer getPrinter()
    {
        return mPrinter;
    }

    public int getRowCount()
    {
        return mVerticalAxis.getCount();
    }

    public boolean getUseDefaultMargins()
    {
        return mUseDefaultMargins;
    }

    public boolean isColumnOrderPreserved()
    {
        return mHorizontalAxis.isOrderPreserved();
    }

    public boolean isRowOrderPreserved()
    {
        return mVerticalAxis.isOrderPreserved();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        consistencyCheck();
        k -= i;
        int i1 = getPaddingLeft();
        int j1 = getPaddingTop();
        int k1 = getPaddingRight();
        i = getPaddingBottom();
        mHorizontalAxis.layout(k - i1 - k1);
        mVerticalAxis.layout(l - j - j1 - i);
        int ai[] = mHorizontalAxis.getLocations();
        int ai1[] = mVerticalAxis.getLocations();
        i = 0;
        l = getChildCount();
        while (i < l) 
        {
            View view = getChildAt(i);
            if (view.getVisibility() != 8)
            {
                Object obj1 = getLayoutParams(view);
                Object obj = ((LayoutParams) (obj1)).columnSpec;
                obj1 = ((LayoutParams) (obj1)).rowSpec;
                Object obj2 = ((Spec) (obj)).span;
                Object obj3 = ((Spec) (obj1)).span;
                j = ai[((Interval) (obj2)).min];
                int l1 = ai1[((Interval) (obj3)).min];
                int j2 = ai[((Interval) (obj2)).max];
                int i2 = ai1[((Interval) (obj3)).max];
                int j3 = j2 - j;
                int l3 = i2 - l1;
                int k4 = getMeasurement(view, true);
                int i4 = getMeasurement(view, false);
                obj = ((Spec) (obj)).getAbsoluteAlignment(true);
                obj1 = ((Spec) (obj1)).getAbsoluteAlignment(false);
                obj2 = (Bounds)mHorizontalAxis.getGroupBounds().getValue(i);
                obj3 = (Bounds)mVerticalAxis.getGroupBounds().getValue(i);
                int k3 = ((Alignment) (obj)).getGravityOffset(view, j3 - ((Bounds) (obj2)).size(true));
                i2 = ((Alignment) (obj1)).getGravityOffset(view, l3 - ((Bounds) (obj3)).size(true));
                int l2 = getMargin(view, true, true);
                j2 = getMargin(view, false, true);
                int i3 = getMargin(view, true, false);
                int k2 = getMargin(view, false, false);
                int l4 = l2 + i3;
                int i5 = j2 + k2;
                int j4 = ((Bounds) (obj2)).getOffset(this, view, ((Alignment) (obj)), k4 + l4, true);
                k2 = ((Bounds) (obj3)).getOffset(this, view, ((Alignment) (obj1)), i4 + i5, false);
                j3 = ((Alignment) (obj)).getSizeInCell(view, k4, j3 - l4);
                l3 = ((Alignment) (obj1)).getSizeInCell(view, i4, l3 - i5);
                j = j + k3 + j4;
                if (!isLayoutRtlCompat())
                {
                    j = i1 + l2 + j;
                } else
                {
                    j = k - j3 - k1 - i3 - j;
                }
                l1 = j1 + l1 + i2 + k2 + j2;
                if (j3 != view.getMeasuredWidth() || l3 != view.getMeasuredHeight())
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l3, 0x40000000));
                }
                view.layout(j, l1, j + j3, l1 + l3);
            }
            i++;
        }
    }

    protected void onMeasure(int i, int j)
    {
        consistencyCheck();
        invalidateValues();
        int j1 = getPaddingLeft() + getPaddingRight();
        int i1 = getPaddingTop() + getPaddingBottom();
        int k1 = adjust(i, -j1);
        int l1 = adjust(j, -i1);
        measureChildrenWithMargins(k1, l1, true);
        int k;
        int l;
        if (mOrientation == 0)
        {
            l = mHorizontalAxis.getMeasure(k1);
            measureChildrenWithMargins(k1, l1, false);
            k = mVerticalAxis.getMeasure(l1);
        } else
        {
            k = mVerticalAxis.getMeasure(l1);
            measureChildrenWithMargins(k1, l1, false);
            l = mHorizontalAxis.getMeasure(k1);
        }
        l = Math.max(l + j1, getSuggestedMinimumWidth());
        k = Math.max(k + i1, getSuggestedMinimumHeight());
        setMeasuredDimension(ViewCompat.resolveSizeAndState(l, i, 0), ViewCompat.resolveSizeAndState(k, j, 0));
    }

    public void requestLayout()
    {
        super.requestLayout();
        invalidateStructure();
    }

    public void setAlignmentMode(int i)
    {
        mAlignmentMode = i;
        requestLayout();
    }

    public void setColumnCount(int i)
    {
        mHorizontalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean flag)
    {
        mHorizontalAxis.setOrderPreserved(flag);
        invalidateStructure();
        requestLayout();
    }

    public void setOrientation(int i)
    {
        if (mOrientation != i)
        {
            mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer)
    {
        Printer printer1 = printer;
        if (printer == null)
        {
            printer1 = NO_PRINTER;
        }
        mPrinter = printer1;
    }

    public void setRowCount(int i)
    {
        mVerticalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean flag)
    {
        mVerticalAxis.setOrderPreserved(flag);
        invalidateStructure();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean flag)
    {
        mUseDefaultMargins = flag;
        requestLayout();
    }

    static 
    {
        ORIENTATION = android.support.v7.gridlayout.R.styleable.GridLayout_orientation;
        ROW_COUNT = android.support.v7.gridlayout.R.styleable.GridLayout_rowCount;
        COLUMN_COUNT = android.support.v7.gridlayout.R.styleable.GridLayout_columnCount;
        USE_DEFAULT_MARGINS = android.support.v7.gridlayout.R.styleable.GridLayout_useDefaultMargins;
        ALIGNMENT_MODE = android.support.v7.gridlayout.R.styleable.GridLayout_alignmentMode;
        ROW_ORDER_PRESERVED = android.support.v7.gridlayout.R.styleable.GridLayout_rowOrderPreserved;
        COLUMN_ORDER_PRESERVED = android.support.v7.gridlayout.R.styleable.GridLayout_columnOrderPreserved;
        LEADING = new Alignment() {

            public int getAlignmentValue(View view, int i, int j)
            {
                return 0;
            }

            String getDebugString()
            {
                return "LEADING";
            }

            int getGravityOffset(View view, int i)
            {
                return 0;
            }

        };
        TRAILING = new Alignment() {

            public int getAlignmentValue(View view, int i, int j)
            {
                return i;
            }

            String getDebugString()
            {
                return "TRAILING";
            }

            int getGravityOffset(View view, int i)
            {
                return i;
            }

        };
        TOP = LEADING;
        BOTTOM = TRAILING;
        START = LEADING;
        END = TRAILING;
        LEFT = createSwitchingAlignment(START, END);
        RIGHT = createSwitchingAlignment(END, START);
    }

}
