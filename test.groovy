commands = '''#!/bin/bash
pwd
echo "welcome"
'''
job('test-job2') {
  
    steps {
        shell("pwd")
        shell(commands)
    }
}
