.class Lcom/facebook/appevents/AppEventsLogger$2;
.super Ljava/lang/Object;
.source "AppEventsLogger.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/appevents/AppEventsLogger;->deactivateApp(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final synthetic val$eventTime:J

.field private final synthetic val$logger:Lcom/facebook/appevents/AppEventsLogger;


# direct methods
.method constructor <init>(Lcom/facebook/appevents/AppEventsLogger;J)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/appevents/AppEventsLogger$2;->val$logger:Lcom/facebook/appevents/AppEventsLogger;

    iput-wide p2, p0, Lcom/facebook/appevents/AppEventsLogger$2;->val$eventTime:J

    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 344
    iget-object v0, p0, Lcom/facebook/appevents/AppEventsLogger$2;->val$logger:Lcom/facebook/appevents/AppEventsLogger;

    iget-wide v2, p0, Lcom/facebook/appevents/AppEventsLogger$2;->val$eventTime:J

    # invokes: Lcom/facebook/appevents/AppEventsLogger;->logAppSessionSuspendEvent(J)V
    invoke-static {v0, v2, v3}, Lcom/facebook/appevents/AppEventsLogger;->access$4(Lcom/facebook/appevents/AppEventsLogger;J)V

    .line 345
    return-void
.end method
