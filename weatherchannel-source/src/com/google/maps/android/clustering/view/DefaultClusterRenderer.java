// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.maps.android.MarkerManager;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.maps.android.clustering.view:
//            ClusterRenderer

public class DefaultClusterRenderer
    implements ClusterRenderer
{
    private class AnimationTask extends AnimatorListenerAdapter
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private final LatLng from;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final Marker marker;
        private final MarkerWithPosition markerWithPosition;
        final DefaultClusterRenderer this$0;
        private final LatLng to;

        public void onAnimationEnd(Animator animator)
        {
            if (mRemoveOnComplete)
            {
                animator = (Cluster)mMarkerToCluster.get(marker);
                mClusterToMarker.remove(animator);
                mMarkerCache.remove(marker);
                mMarkerToCluster.remove(marker);
                mMarkerManager.remove(marker);
            }
            markerWithPosition.position = to;
        }

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f = valueanimator.getAnimatedFraction();
            double d2 = to.latitude;
            double d3 = from.latitude;
            double d4 = f;
            double d5 = from.latitude;
            double d1 = to.longitude - from.longitude;
            double d = d1;
            if (Math.abs(d1) > 180D)
            {
                d = d1 - Math.signum(d1) * 360D;
            }
            valueanimator = new LatLng((d2 - d3) * d4 + d5, (double)f * d + from.longitude);
            marker.setPosition(valueanimator);
        }

        public void perform()
        {
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setInterpolator(DefaultClusterRenderer.ANIMATION_INTERP);
            valueanimator.addUpdateListener(this);
            valueanimator.addListener(this);
            valueanimator.start();
        }

        public void removeOnAnimationComplete(MarkerManager markermanager)
        {
            mMarkerManager = markermanager;
            mRemoveOnComplete = true;
        }

        private AnimationTask(MarkerWithPosition markerwithposition, LatLng latlng, LatLng latlng1)
        {
            this$0 = DefaultClusterRenderer.this;
            super();
            markerWithPosition = markerwithposition;
            marker = markerwithposition.marker;
            from = latlng;
            to = latlng1;
        }

    }

    private class CreateMarkerTask
    {

        private final LatLng animateFrom;
        private final Cluster cluster;
        private final Set newMarkers;
        final DefaultClusterRenderer this$0;

        private void perform(MarkerModifier markermodifier)
        {
            if (!shouldRenderAsCluster(cluster))
            {
                Iterator iterator = cluster.getItems().iterator();
                while (iterator.hasNext()) 
                {
                    ClusterItem clusteritem = (ClusterItem)iterator.next();
                    Object obj = mMarkerCache.get(clusteritem);
                    MarkerWithPosition markerwithposition;
                    if (obj == null)
                    {
                        obj = new MarkerOptions();
                        Marker marker;
                        MarkerWithPosition markerwithposition1;
                        if (animateFrom != null)
                        {
                            ((MarkerOptions) (obj)).position(animateFrom);
                        } else
                        {
                            ((MarkerOptions) (obj)).position(clusteritem.getPosition());
                        }
                        onBeforeClusterItemRendered(clusteritem, ((MarkerOptions) (obj)));
                        marker = mClusterManager.getMarkerCollection().addMarker(((MarkerOptions) (obj)));
                        markerwithposition1 = new MarkerWithPosition(marker);
                        mMarkerCache.put(clusteritem, marker);
                        obj = marker;
                        markerwithposition = markerwithposition1;
                        if (animateFrom != null)
                        {
                            markermodifier.animate(markerwithposition1, animateFrom, clusteritem.getPosition());
                            markerwithposition = markerwithposition1;
                            obj = marker;
                        }
                    } else
                    {
                        markerwithposition = new MarkerWithPosition(((Marker) (obj)));
                    }
                    onClusterItemRendered(clusteritem, ((Marker) (obj)));
                    newMarkers.add(markerwithposition);
                }
            } else
            {
                Object obj2 = new MarkerOptions();
                Object obj1;
                if (animateFrom == null)
                {
                    obj1 = cluster.getPosition();
                } else
                {
                    obj1 = animateFrom;
                }
                obj1 = ((MarkerOptions) (obj2)).position(((LatLng) (obj1)));
                onBeforeClusterRendered(cluster, ((MarkerOptions) (obj1)));
                obj1 = mClusterManager.getClusterMarkerCollection().addMarker(((MarkerOptions) (obj1)));
                mMarkerToCluster.put(obj1, cluster);
                mClusterToMarker.put(cluster, obj1);
                obj2 = new MarkerWithPosition(((Marker) (obj1)));
                if (animateFrom != null)
                {
                    markermodifier.animate(((MarkerWithPosition) (obj2)), animateFrom, cluster.getPosition());
                }
                onClusterRendered(cluster, ((Marker) (obj1)));
                newMarkers.add(obj2);
            }
        }


        public CreateMarkerTask(Cluster cluster1, Set set, LatLng latlng)
        {
            this$0 = DefaultClusterRenderer.this;
            super();
            cluster = cluster1;
            newMarkers = set;
            animateFrom = latlng;
        }
    }

    private static class MarkerCache
    {

        private Map mCache;
        private Map mCacheReverse;

        public Marker get(Object obj)
        {
            return (Marker)mCache.get(obj);
        }

        public Object get(Marker marker)
        {
            return mCacheReverse.get(marker);
        }

        public void put(Object obj, Marker marker)
        {
            mCache.put(obj, marker);
            mCacheReverse.put(marker, obj);
        }

        public void remove(Marker marker)
        {
            Object obj = mCacheReverse.get(marker);
            mCacheReverse.remove(marker);
            mCache.remove(obj);
        }

        private MarkerCache()
        {
            mCache = new HashMap();
            mCacheReverse = new HashMap();
        }

    }

    private class MarkerModifier extends Handler
        implements android.os.MessageQueue.IdleHandler
    {

        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private Queue mAnimationTasks;
        private Queue mCreateMarkerTasks;
        private boolean mListenerAdded;
        private Queue mOnScreenCreateMarkerTasks;
        private Queue mOnScreenRemoveMarkerTasks;
        private Queue mRemoveMarkerTasks;
        final DefaultClusterRenderer this$0;

        private void performNextTask()
        {
            if (!mOnScreenRemoveMarkerTasks.isEmpty())
            {
                removeMarker((Marker)mOnScreenRemoveMarkerTasks.poll());
            } else
            {
                if (!mAnimationTasks.isEmpty())
                {
                    ((AnimationTask)mAnimationTasks.poll()).perform();
                    return;
                }
                if (!mOnScreenCreateMarkerTasks.isEmpty())
                {
                    ((CreateMarkerTask)mOnScreenCreateMarkerTasks.poll()).perform(this);
                    return;
                }
                if (!mCreateMarkerTasks.isEmpty())
                {
                    ((CreateMarkerTask)mCreateMarkerTasks.poll()).perform(this);
                    return;
                }
                if (!mRemoveMarkerTasks.isEmpty())
                {
                    removeMarker((Marker)mRemoveMarkerTasks.poll());
                    return;
                }
            }
        }

        private void removeMarker(Marker marker)
        {
            Cluster cluster = (Cluster)mMarkerToCluster.get(marker);
            mClusterToMarker.remove(cluster);
            mMarkerCache.remove(marker);
            mMarkerToCluster.remove(marker);
            mClusterManager.getMarkerManager().remove(marker);
        }

        public void add(boolean flag, CreateMarkerTask createmarkertask)
        {
            lock.lock();
            sendEmptyMessage(0);
            if (flag)
            {
                mOnScreenCreateMarkerTasks.add(createmarkertask);
            } else
            {
                mCreateMarkerTasks.add(createmarkertask);
            }
            lock.unlock();
        }

        public void animate(MarkerWithPosition markerwithposition, LatLng latlng, LatLng latlng1)
        {
            lock.lock();
            mAnimationTasks.add(new AnimationTask(markerwithposition, latlng, latlng1));
            lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerwithposition, LatLng latlng, LatLng latlng1)
        {
            lock.lock();
            markerwithposition = new AnimationTask(markerwithposition, latlng, latlng1);
            markerwithposition.removeOnAnimationComplete(mClusterManager.getMarkerManager());
            mAnimationTasks.add(markerwithposition);
            lock.unlock();
        }

        public void handleMessage(Message message)
        {
            int i;
            if (!mListenerAdded)
            {
                Looper.myQueue().addIdleHandler(this);
                mListenerAdded = true;
            }
            removeMessages(0);
            lock.lock();
            i = 0;
_L2:
            if (i >= 10)
            {
                break; /* Loop/switch isn't completed */
            }
            performNextTask();
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            if (isBusy()) goto _L4; else goto _L3
_L3:
            mListenerAdded = false;
            Looper.myQueue().removeIdleHandler(this);
            busyCondition.signalAll();
_L6:
            lock.unlock();
            return;
_L4:
            sendEmptyMessageDelayed(0, 10L);
            if (true) goto _L6; else goto _L5
_L5:
            message;
            lock.unlock();
            throw message;
        }

        public boolean isBusy()
        {
            lock.lock();
            if (!mCreateMarkerTasks.isEmpty() || !mOnScreenCreateMarkerTasks.isEmpty() || !mOnScreenRemoveMarkerTasks.isEmpty() || !mRemoveMarkerTasks.isEmpty()) goto _L2; else goto _L1
_L1:
            boolean flag = mAnimationTasks.isEmpty();
            if (flag) goto _L3; else goto _L2
_L2:
            flag = true;
_L5:
            lock.unlock();
            return flag;
_L3:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
            Exception exception;
            exception;
            lock.unlock();
            throw exception;
        }

        public boolean queueIdle()
        {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean flag, Marker marker)
        {
            lock.lock();
            sendEmptyMessage(0);
            if (flag)
            {
                mOnScreenRemoveMarkerTasks.add(marker);
            } else
            {
                mRemoveMarkerTasks.add(marker);
            }
            lock.unlock();
        }

        public void waitUntilFree()
        {
_L2:
            if (!isBusy())
            {
                break; /* Loop/switch isn't completed */
            }
            sendEmptyMessage(0);
            lock.lock();
            if (isBusy())
            {
                busyCondition.await();
            }
            lock.unlock();
            if (true) goto _L2; else goto _L1
            Object obj;
            obj;
            throw new RuntimeException(((Throwable) (obj)));
            obj;
            lock.unlock();
            throw obj;
_L1:
        }

        private MarkerModifier()
        {
            this$0 = DefaultClusterRenderer.this;
            super(Looper.getMainLooper());
            lock = new ReentrantLock();
            busyCondition = lock.newCondition();
            mCreateMarkerTasks = new LinkedList();
            mOnScreenCreateMarkerTasks = new LinkedList();
            mRemoveMarkerTasks = new LinkedList();
            mOnScreenRemoveMarkerTasks = new LinkedList();
            mAnimationTasks = new LinkedList();
        }

    }

    private static class MarkerWithPosition
    {

        private final Marker marker;
        private LatLng position;

        public boolean equals(Object obj)
        {
            if (obj instanceof MarkerWithPosition)
            {
                return marker.equals(((MarkerWithPosition)obj).marker);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return marker.hashCode();
        }



/*
        static LatLng access$1602(MarkerWithPosition markerwithposition, LatLng latlng)
        {
            markerwithposition.position = latlng;
            return latlng;
        }

*/


        private MarkerWithPosition(Marker marker1)
        {
            marker = marker1;
            position = marker1.getPosition();
        }

    }

    private class RenderTask
        implements Runnable
    {

        final Set clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private Projection mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;
        final DefaultClusterRenderer this$0;

        public void run()
        {
            if (clusters.equals(mClusters))
            {
                mCallback.run();
                return;
            }
            MarkerModifier markermodifier = new MarkerModifier();
            float f = mMapZoom;
            float f1;
            Object obj;
            Object obj1;
            LatLngBounds latlngbounds;
            Set set;
            boolean flag;
            if (f > mZoom)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1 = mZoom;
            set = mMarkers;
            latlngbounds = mProjection.getVisibleRegion().latLngBounds;
            obj1 = null;
            obj = obj1;
            if (mClusters != null)
            {
                obj = obj1;
                if (DefaultClusterRenderer.SHOULD_ANIMATE)
                {
                    ArrayList arraylist = new ArrayList();
                    Iterator iterator2 = mClusters.iterator();
                    do
                    {
                        obj = arraylist;
                        if (!iterator2.hasNext())
                        {
                            break;
                        }
                        obj = (Cluster)iterator2.next();
                        if (shouldRenderAsCluster(((Cluster) (obj))) && latlngbounds.contains(((Cluster) (obj)).getPosition()))
                        {
                            arraylist.add(mSphericalMercatorProjection.toPoint(((Cluster) (obj)).getPosition()));
                        }
                    } while (true);
                }
            }
            Set set1 = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Iterator iterator = clusters.iterator(); iterator.hasNext();)
            {
                Cluster cluster = (Cluster)iterator.next();
                boolean flag1 = latlngbounds.contains(cluster.getPosition());
                if (flag && flag1 && DefaultClusterRenderer.SHOULD_ANIMATE)
                {
                    Object obj3 = DefaultClusterRenderer.findClosestCluster(((List) (obj)), mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    if (obj3 != null)
                    {
                        obj3 = mSphericalMercatorProjection.toLatLng(((Point) (obj3)));
                        markermodifier.add(true, new CreateMarkerTask(cluster, set1, ((LatLng) (obj3))));
                    } else
                    {
                        markermodifier.add(true, new CreateMarkerTask(cluster, set1, null));
                    }
                } else
                {
                    markermodifier.add(flag1, new CreateMarkerTask(cluster, set1, null));
                }
            }

            markermodifier.waitUntilFree();
            set.removeAll(set1);
            obj = null;
            if (DefaultClusterRenderer.SHOULD_ANIMATE)
            {
                ArrayList arraylist1 = new ArrayList();
                Iterator iterator3 = clusters.iterator();
                do
                {
                    obj = arraylist1;
                    if (!iterator3.hasNext())
                    {
                        break;
                    }
                    obj = (Cluster)iterator3.next();
                    if (shouldRenderAsCluster(((Cluster) (obj))) && latlngbounds.contains(((Cluster) (obj)).getPosition()))
                    {
                        arraylist1.add(mSphericalMercatorProjection.toPoint(((Cluster) (obj)).getPosition()));
                    }
                } while (true);
            }
            for (Iterator iterator1 = set.iterator(); iterator1.hasNext();)
            {
                MarkerWithPosition markerwithposition = (MarkerWithPosition)iterator1.next();
                boolean flag2 = latlngbounds.contains(markerwithposition.position);
                if (!flag && f - f1 > -3F && flag2 && DefaultClusterRenderer.SHOULD_ANIMATE)
                {
                    Object obj2 = DefaultClusterRenderer.findClosestCluster(((List) (obj)), mSphericalMercatorProjection.toPoint(markerwithposition.position));
                    if (obj2 != null)
                    {
                        obj2 = mSphericalMercatorProjection.toLatLng(((Point) (obj2)));
                        markermodifier.animateThenRemove(markerwithposition, markerwithposition.position, ((LatLng) (obj2)));
                    } else
                    {
                        markermodifier.remove(true, markerwithposition.marker);
                    }
                } else
                {
                    markermodifier.remove(flag2, markerwithposition.marker);
                }
            }

            markermodifier.waitUntilFree();
            mMarkers = set1;
            mClusters = clusters;
            mZoom = f;
            mCallback.run();
        }

        public void setCallback(Runnable runnable)
        {
            mCallback = runnable;
        }

        public void setMapZoom(float f)
        {
            mMapZoom = f;
            mSphericalMercatorProjection = new SphericalMercatorProjection(256D * Math.pow(2D, Math.min(f, mZoom)));
        }

        public void setProjection(Projection projection)
        {
            mProjection = projection;
        }

        private RenderTask(Set set)
        {
            this$0 = DefaultClusterRenderer.this;
            super();
            clusters = set;
        }

    }

    private class ViewModifier extends Handler
    {

        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private RenderTask mNextClusters;
        private boolean mViewModificationInProgress;
        final DefaultClusterRenderer this$0;

        public void handleMessage(Message message)
        {
            if (message.what != 1) goto _L2; else goto _L1
_L1:
            mViewModificationInProgress = false;
            if (mNextClusters != null)
            {
                sendEmptyMessage(0);
            }
_L4:
            return;
_L2:
            removeMessages(0);
            if (mViewModificationInProgress || mNextClusters == null) goto _L4; else goto _L3
_L3:
            this;
            JVM INSTR monitorenter ;
            message = mNextClusters;
            mNextClusters = null;
            mViewModificationInProgress = true;
            this;
            JVM INSTR monitorexit ;
            message.setCallback(new Runnable() {

                final ViewModifier this$1;

                public void run()
                {
                    sendEmptyMessage(1);
                }

            
            {
                this$1 = ViewModifier.this;
                super();
            }
            });
            message.setProjection(mMap.getProjection());
            message.setMapZoom(mMap.getCameraPosition().zoom);
            (new Thread(message)).start();
            return;
            message;
            this;
            JVM INSTR monitorexit ;
            throw message;
        }

        public void queue(Set set)
        {
            this;
            JVM INSTR monitorenter ;
            mNextClusters = new RenderTask(set);
            this;
            JVM INSTR monitorexit ;
            sendEmptyMessage(0);
            return;
            set;
            this;
            JVM INSTR monitorexit ;
            throw set;
        }

        private ViewModifier()
        {
            this$0 = DefaultClusterRenderer.this;
            super();
            mViewModificationInProgress = false;
            mNextClusters = null;
        }

    }


    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private static final int BUCKETS[] = {
        10, 20, 50, 100, 200, 500, 1000
    };
    private static final int MIN_CLUSTER_SIZE = 4;
    private static final boolean SHOULD_ANIMATE;
    private com.google.maps.android.clustering.ClusterManager.OnClusterClickListener mClickListener;
    private final ClusterManager mClusterManager;
    private Map mClusterToMarker;
    private Set mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private SparseArray mIcons;
    private com.google.maps.android.clustering.ClusterManager.OnClusterInfoWindowClickListener mInfoWindowClickListener;
    private com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener mItemClickListener;
    private com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener mItemInfoWindowClickListener;
    private final GoogleMap mMap;
    private MarkerCache mMarkerCache;
    private Map mMarkerToCluster;
    private Set mMarkers;
    private final ViewModifier mViewModifier = new ViewModifier();
    private float mZoom;

    public DefaultClusterRenderer(Context context, GoogleMap googlemap, ClusterManager clustermanager)
    {
        mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
        mIcons = new SparseArray();
        mMarkerCache = new MarkerCache();
        mMarkerToCluster = new HashMap();
        mClusterToMarker = new HashMap();
        mMap = googlemap;
        mDensity = context.getResources().getDisplayMetrics().density;
        mIconGenerator = new IconGenerator(context);
        mIconGenerator.setContentView(makeSquareTextView(context));
        mIconGenerator.setTextAppearance(com.google.maps.android.R.style.ClusterIcon_TextAppearance);
        mIconGenerator.setBackground(makeClusterBackground());
        mClusterManager = clustermanager;
    }

    private static double distanceSquared(Point point, Point point1)
    {
        return (point.x - point1.x) * (point.x - point1.x) + (point.y - point1.y) * (point.y - point1.y);
    }

    private static Point findClosestCluster(List list, Point point)
    {
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Point) (obj));
_L2:
        double d = 10000D;
        obj = null;
        Iterator iterator = list.iterator();
        list = ((List) (obj));
        do
        {
            obj = list;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (Point)iterator.next();
            double d1 = distanceSquared(((Point) (obj)), point);
            if (d1 < d)
            {
                list = ((List) (obj));
                d = d1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getColor(int i)
    {
        float f = Math.min(i, 300F);
        return Color.HSVToColor(new float[] {
            (((300F - f) * (300F - f)) / 90000F) * 220F, 1.0F, 0.6F
        });
    }

    private LayerDrawable makeClusterBackground()
    {
        mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        Object obj = new ShapeDrawable(new OvalShape());
        ((ShapeDrawable) (obj)).getPaint().setColor(0x80ffffff);
        obj = new LayerDrawable(new Drawable[] {
            obj, mColoredCircleBackground
        });
        int i = (int)(mDensity * 3F);
        ((LayerDrawable) (obj)).setLayerInset(1, i, i, i, i);
        return ((LayerDrawable) (obj));
    }

    private SquareTextView makeSquareTextView(Context context)
    {
        context = new SquareTextView(context);
        context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        context.setId(com.google.maps.android.R.id.text);
        int i = (int)(12F * mDensity);
        context.setPadding(i, i, i, i);
        return context;
    }

    protected int getBucket(Cluster cluster)
    {
        int j = cluster.getSize();
        if (j <= BUCKETS[0])
        {
            return j;
        }
        for (int i = 0; i < BUCKETS.length - 1; i++)
        {
            if (j < BUCKETS[i + 1])
            {
                return BUCKETS[i];
            }
        }

        return BUCKETS[BUCKETS.length - 1];
    }

    public Cluster getCluster(Marker marker)
    {
        return (Cluster)mMarkerToCluster.get(marker);
    }

    public ClusterItem getClusterItem(Marker marker)
    {
        return (ClusterItem)mMarkerCache.get(marker);
    }

    protected String getClusterText(int i)
    {
        if (i < BUCKETS[0])
        {
            return String.valueOf(i);
        } else
        {
            return (new StringBuilder()).append(String.valueOf(i)).append("+").toString();
        }
    }

    public Marker getMarker(Cluster cluster)
    {
        return (Marker)mClusterToMarker.get(cluster);
    }

    public Marker getMarker(ClusterItem clusteritem)
    {
        return mMarkerCache.get(clusteritem);
    }

    public void onAdd()
    {
        mClusterManager.getMarkerCollection().setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {

            final DefaultClusterRenderer this$0;

            public boolean onMarkerClick(Marker marker)
            {
                return mItemClickListener != null && mItemClickListener.onClusterItemClick((ClusterItem)mMarkerCache.get(marker));
            }

            
            {
                this$0 = DefaultClusterRenderer.this;
                super();
            }
        });
        mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() {

            final DefaultClusterRenderer this$0;

            public void onInfoWindowClick(Marker marker)
            {
                if (mItemInfoWindowClickListener != null)
                {
                    mItemInfoWindowClickListener.onClusterItemInfoWindowClick((ClusterItem)mMarkerCache.get(marker));
                }
            }

            
            {
                this$0 = DefaultClusterRenderer.this;
                super();
            }
        });
        mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {

            final DefaultClusterRenderer this$0;

            public boolean onMarkerClick(Marker marker)
            {
                return mClickListener != null && mClickListener.onClusterClick((Cluster)mMarkerToCluster.get(marker));
            }

            
            {
                this$0 = DefaultClusterRenderer.this;
                super();
            }
        });
        mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() {

            final DefaultClusterRenderer this$0;

            public void onInfoWindowClick(Marker marker)
            {
                if (mInfoWindowClickListener != null)
                {
                    mInfoWindowClickListener.onClusterInfoWindowClick((Cluster)mMarkerToCluster.get(marker));
                }
            }

            
            {
                this$0 = DefaultClusterRenderer.this;
                super();
            }
        });
    }

    protected void onBeforeClusterItemRendered(ClusterItem clusteritem, MarkerOptions markeroptions)
    {
    }

    protected void onBeforeClusterRendered(Cluster cluster, MarkerOptions markeroptions)
    {
        int i = getBucket(cluster);
        BitmapDescriptor bitmapdescriptor = (BitmapDescriptor)mIcons.get(i);
        cluster = bitmapdescriptor;
        if (bitmapdescriptor == null)
        {
            mColoredCircleBackground.getPaint().setColor(getColor(i));
            cluster = BitmapDescriptorFactory.fromBitmap(mIconGenerator.makeIcon(getClusterText(i)));
            mIcons.put(i, cluster);
        }
        markeroptions.icon(cluster);
    }

    protected void onClusterItemRendered(ClusterItem clusteritem, Marker marker)
    {
    }

    protected void onClusterRendered(Cluster cluster, Marker marker)
    {
    }

    public void onClustersChanged(Set set)
    {
        mViewModifier.queue(set);
    }

    public void onRemove()
    {
        mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
    }

    public void setOnClusterClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterClickListener onclusterclicklistener)
    {
        mClickListener = onclusterclicklistener;
    }

    public void setOnClusterInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterInfoWindowClickListener onclusterinfowindowclicklistener)
    {
        mInfoWindowClickListener = onclusterinfowindowclicklistener;
    }

    public void setOnClusterItemClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener onclusteritemclicklistener)
    {
        mItemClickListener = onclusteritemclicklistener;
    }

    public void setOnClusterItemInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener onclusteriteminfowindowclicklistener)
    {
        mItemInfoWindowClickListener = onclusteriteminfowindowclicklistener;
    }

    protected boolean shouldRenderAsCluster(Cluster cluster)
    {
        return cluster.getSize() > 4;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SHOULD_ANIMATE = flag;
    }



/*
    static float access$1002(DefaultClusterRenderer defaultclusterrenderer, float f)
    {
        defaultclusterrenderer.mZoom = f;
        return f;
    }

*/



/*
    static Set access$1102(DefaultClusterRenderer defaultclusterrenderer, Set set)
    {
        defaultclusterrenderer.mClusters = set;
        return set;
    }

*/



/*
    static Set access$1302(DefaultClusterRenderer defaultclusterrenderer, Set set)
    {
        defaultclusterrenderer.mMarkers = set;
        return set;
    }

*/












}
