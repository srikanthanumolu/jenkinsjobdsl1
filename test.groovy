def Steps = '''#!/bin/bash
pwd
echo "welcome home"
'''
job('test-job2') {
  
    steps {
        shell(steps)
    }
}
