.class final Lcom/adobe/mobile/AudienceManagerWorker$4;
.super Ljava/lang/Object;
.source "AudienceManagerWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/adobe/mobile/AudienceManagerWorker;->SetDpidAndDpuuid(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$newDpid:Ljava/lang/String;

.field final synthetic val$newDpuuid:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/adobe/mobile/AudienceManagerWorker$4;->val$newDpid:Ljava/lang/String;

    iput-object p2, p0, Lcom/adobe/mobile/AudienceManagerWorker$4;->val$newDpuuid:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/adobe/mobile/AudienceManagerWorker$4;->val$newDpid:Ljava/lang/String;

    # setter for: Lcom/adobe/mobile/AudienceManagerWorker;->_dpid:Ljava/lang/String;
    invoke-static {v0}, Lcom/adobe/mobile/AudienceManagerWorker;->access$302(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    iget-object v0, p0, Lcom/adobe/mobile/AudienceManagerWorker$4;->val$newDpuuid:Ljava/lang/String;

    # setter for: Lcom/adobe/mobile/AudienceManagerWorker;->_dpuuid:Ljava/lang/String;
    invoke-static {v0}, Lcom/adobe/mobile/AudienceManagerWorker;->access$202(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    return-void
.end method
