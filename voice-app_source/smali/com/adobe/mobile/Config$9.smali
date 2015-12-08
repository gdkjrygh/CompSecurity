.class final Lcom/adobe/mobile/Config$9;
.super Ljava/lang/Object;
.source "Config.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/Config;->collectLifecycleData(Landroid/app/Activity;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$activity:Landroid/app/Activity;

.field final synthetic val$contextData:Ljava/util/Map;


# direct methods
.method constructor <init>(Landroid/app/Activity;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 199
    iput-object p1, p0, Lcom/adobe/mobile/Config$9;->val$activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/adobe/mobile/Config$9;->val$contextData:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lcom/adobe/mobile/Config$9;->val$activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/adobe/mobile/Config$9;->val$contextData:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/adobe/mobile/Lifecycle;->start(Landroid/app/Activity;Ljava/util/Map;)V

    .line 202
    return-void
.end method
