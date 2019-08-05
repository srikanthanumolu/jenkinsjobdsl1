job('test-job2') {
  
    steps {
        shell("pwd")
        shell("echo 'hi'")
    }
}
