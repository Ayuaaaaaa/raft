package com.github.raftimpl.raft.service;

import com.baidu.brpc.client.RpcCallback;
import com.github.raftimpl.raft.proto.RaftProto;

import java.util.concurrent.Future;

/**
 * 用于生成client异步调用所需的proxy
 * Created by raftimpl on 2017/5/14.
 */
public interface RaftClientServiceAsync extends RaftClientService {

    Future<RaftProto.GetLeaderResponse> getLeader(
            RaftProto.GetLeaderRequest request,
            RpcCallback<RaftProto.GetLeaderResponse> callback);

    Future<RaftProto.GetConfigurationResponse> getConfiguration(
            RaftProto.GetConfigurationRequest request,
            RpcCallback<RaftProto.GetConfigurationResponse> callback);

    Future<RaftProto.AddPeersResponse> addPeers(  //增加节点
            RaftProto.AddPeersRequest request,
            RpcCallback<RaftProto.AddPeersResponse> callback);

    Future<RaftProto.RemovePeersResponse> removePeers(   //移除节点
            RaftProto.RemovePeersRequest request,
            RpcCallback<RaftProto.RemovePeersResponse> callback);
}
