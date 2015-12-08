.class Lcom/kochava/android/tracker/Feature$6;
.super Ljava/util/TimerTask;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->startSession()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 1748
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$6;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 1752
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V

    .line 1753
    return-void
.end method
