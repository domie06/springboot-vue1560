const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmsi3i6/",
            name: "ssmsi3i6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmsi3i6/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "农家乐信息平台"
        } 
    }
}
export default base
