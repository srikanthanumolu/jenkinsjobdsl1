commands = '''#!/bin/bash
pwd
echo "welcome hi"
'''
job('test-job2') {
  
    steps {
        shell(commands)
    }
}
