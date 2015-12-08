.class Lcom/google/android/gms/wearable/WearableListenerService$zza$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/WearableListenerService$zza;->onConnectedNodes(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zzaTi:Lcom/google/android/gms/wearable/WearableListenerService$zza;

.field final synthetic zzaTl:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$zza;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$5;->zzaTi:Lcom/google/android/gms/wearable/WearableListenerService$zza;

    iput-object p2, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$5;->zzaTl:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$5;->zzaTi:Lcom/google/android/gms/wearable/WearableListenerService$zza;

    iget-object v0, v0, Lcom/google/android/gms/wearable/WearableListenerService$zza;->zzaTg:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$zza$5;->zzaTl:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/WearableListenerService;->onConnectedNodes(Ljava/util/List;)V

    return-void
.end method
