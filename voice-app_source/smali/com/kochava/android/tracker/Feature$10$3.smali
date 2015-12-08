.class Lcom/kochava/android/tracker/Feature$10$3;
.super Ljava/util/TimerTask;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature$10;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/kochava/android/tracker/Feature$10;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature$10;)V
    .locals 0
    .param p1, "this$1"    # Lcom/kochava/android/tracker/Feature$10;

    .prologue
    .line 2473
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$10$3;->this$1:Lcom/kochava/android/tracker/Feature$10;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 2476
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->flush()V

    .line 2477
    return-void
.end method
