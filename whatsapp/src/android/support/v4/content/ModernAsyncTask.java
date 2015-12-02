// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v4.content:
//            Loader

abstract class ModernAsyncTask
{

    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static final InternalHandler sHandler = new InternalHandler(null);
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private final FutureTask mFuture;
    private volatile Status mStatus;
    private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final WorkerRunnable mWorker = new _cls2();

    public ModernAsyncTask()
    {
        mStatus = Status.PENDING;
        mFuture = new _cls3(mWorker);
    }

    private void finish(Object obj)
    {
label0:
        {
            if (isCancelled())
            {
                onCancelled(obj);
                if (!Loader.a)
                {
                    break label0;
                }
            }
            onPostExecute(obj);
        }
        mStatus = Status.FINISHED;
    }

    private Object postResult(Object obj)
    {
        sHandler.obtainMessage(1, new AsyncTaskResult(new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    private void postResultIfNotInvoked(Object obj)
    {
        if (!mTaskInvoked.get())
        {
            postResult(obj);
        }
    }

    protected abstract Object doInBackground(Object aobj[]);

    public final boolean isCancelled()
    {
        return mFuture.isCancelled();
    }

    protected void onCancelled()
    {
    }

    protected void onCancelled(Object obj)
    {
        onCancelled();
    }

    protected void onPostExecute(Object obj)
    {
    }

    protected void onProgressUpdate(Object aobj[])
    {
    }

    static 
    {
        sThreadFactory = new _cls1();
        sPoolWorkQueue = new LinkedBlockingQueue(10);
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
        sDefaultExecutor = THREAD_POOL_EXECUTOR;
    }





    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;
        private static final String z[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(android/support/v4/content/ModernAsyncTask$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[3];
            obj = "MGpefSE";
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
                    obj = "[Kph|UGz";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "OWpofSE";
                    i = 2;
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    z = as;
                    PENDING = new Status(z[0], 0);
                    RUNNING = new Status(z[2], 1);
                    FINISHED = new Status(z[1], 2);
                    $VALUES = (new Status[] {
                        PENDING, RUNNING, FINISHED
                    });
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 228
        //                       0 249
        //                       1 255
        //                       2 260
        //                       3 266;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_266;
_L3:
            byte byte0 = 47;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 29;
              goto _L9
_L5:
            byte0 = 2;
              goto _L9
_L6:
            byte0 = 62;
              goto _L9
            byte0 = 33;
              goto _L9
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls2 extends WorkerRunnable
    {
        private class WorkerRunnable
            implements Callable
        {

            Object mParams[];

            private WorkerRunnable()
            {
            }

            WorkerRunnable(_cls1 _pcls1)
            {
                this();
            }
        }


        final ModernAsyncTask this$0;

        public Object call()
        {
            mTaskInvoked.set(true);
            Process.setThreadPriority(10);
            return postResult(doInBackground(mParams));
        }

        _cls2()
        {
            this$0 = ModernAsyncTask.this;
            super(null);
        }
    }


    private class _cls3 extends FutureTask
    {

        private static final String z[];
        final ModernAsyncTask this$0;

        protected void done()
        {
            try
            {
                Object obj = get();
                postResultIfNotInvoked(obj);
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w(z[0], interruptedexception);
                return;
            }
            catch (ExecutionException executionexception)
            {
                throw new RuntimeException(z[2], executionexception.getCause());
            }
            catch (CancellationException cancellationexception)
            {
                postResultIfNotInvoked(null);
            }
            catch (Throwable throwable)
            {
                throw new RuntimeException(z[1], throwable);
            }
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[3];
            obj = "a\031m Nt\013g%";
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
                    obj = "a\0044+_R\005fnBC\ta<HDJc&DL\0174+UE\ta:DN\r4*Bi\004V/NK\rf!XN\016<g";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    i = 2;
                    obj = "a\0044+_R\005fnBC\ta<HDJc&DL\0174+UE\ta:DN\r4*Bi\004V/NK\rf!XN\016<g";
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 156
        //                       0 177
        //                       1 183
        //                       2 189
        //                       3 195;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_195;
_L3:
            byte byte0 = 45;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 32;
              goto _L9
_L5:
            byte0 = 106;
              goto _L9
_L6:
            byte0 = 20;
              goto _L9
            byte0 = 78;
              goto _L9
        }

        _cls3(Callable callable)
        {
            this$0 = ModernAsyncTask.this;
            super(callable);
        }
    }


    private class AsyncTaskResult
    {

        final Object mData[];
        final ModernAsyncTask mTask;

        AsyncTaskResult(Object aobj[])
        {
            mTask = ModernAsyncTask.this;
            mData = aobj;
        }
    }


    private class InternalHandler extends Handler
    {

        public void handleMessage(Message message)
        {
            AsyncTaskResult asynctaskresult = (AsyncTaskResult)message.obj;
            message.what;
            JVM INSTR tableswitch 1 2: default 36
        //                       1 37
        //                       2 56;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            asynctaskresult.mTask.finish(asynctaskresult.mData[0]);
            if (!Loader.a) goto _L1; else goto _L3
_L3:
            asynctaskresult.mTask.onProgressUpdate(asynctaskresult.mData);
            return;
        }

        private InternalHandler()
        {
        }

        InternalHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements ThreadFactory
    {

        private static final String z;
        private final AtomicInteger mCount = new AtomicInteger(1);

        public Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append(z).append(mCount.getAndIncrement()).toString());
        }

        static 
        {
            char ac[];
            int i;
            int j;
            ac = "X\030FyX{6QeDv#CoA5T".toCharArray();
            j = ac.length;
            i = 0;
_L7:
            char c;
            if (j <= i)
            {
                z = (new String(ac)).intern();
                return;
            }
            c = ac[i];
            i % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 42;
_L8:
            ac[i] = (char)(byte0 ^ c);
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 21;
              goto _L8
_L3:
            byte0 = 119;
              goto _L8
_L4:
            byte0 = 34;
              goto _L8
            byte0 = 28;
              goto _L8
        }

        _cls1()
        {
        }
    }

}
