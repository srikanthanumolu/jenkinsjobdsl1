commands = '''#!/bin/bash
pwd
echo "welcome home"
'''
job('test-job2') {
  
    steps {
        shell(commands)
    }
}
